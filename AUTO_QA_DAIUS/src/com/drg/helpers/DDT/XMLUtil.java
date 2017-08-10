package com.drg.helpers.DDT;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.testng.TestNG;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class XMLUtil {

	
	@SuppressWarnings({ "boxing", "static-access" })
	public static void createXml(String xlFilePath,String Sheet) throws Exception {
		BufferedWriter bw = null;
		try {

			// Initialization of drivers
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = (Document) documentBuilder.newDocument();

			// Create object for excel utility class
			ExcelLib excel = new ExcelLib(xlFilePath,Sheet);
			excel.ColumnDictionary();

			// Get the Flagged cells with value ="Y" from excel file
			excel.GetFlaggedMethods("Flag");

			// Get Class and Tag Name from Excel Sheets
			LinkedHashMap<String, String> nameClassTest = excel.GetFlaggedClasses();

			// Get the number of parameters to be created in XML
			int flagCount = excel.flaggedMethods.size();

			// Type the suite tag in the element in the XML file
			Element rootElementSuite = document.createElement("suite");

			// Type the parameter set of lines in the xml file
			for (int elementC = 1; elementC <= flagCount; elementC++) {
				Element rootElementParamameter = document.createElement("parameter");
				String[] flagElement = excel.flaggedMethods.get(elementC).toString().split(";");
				rootElementParamameter.setAttribute("name", flagElement[0]);
				rootElementParamameter.setAttribute("value", flagElement[1]);
				rootElementSuite.appendChild(rootElementParamameter);
			}

			for (Map.Entry<String, String> entry : nameClassTest.entrySet()) {
				String className = entry.getKey();
				String testName = entry.getValue();

				// Type the root elements in the XML file
				Element rootElementTest = document.createElement("test");
				Element rootElementClass = document.createElement("classes");
				Element childElementClass = document.createElement("class");
				// Assign attribute to the root elements
				childElementClass.setAttribute("name", className);

				Element rootElementGroups = document.createElement("methods");

				// Assign attribute to the root element
				rootElementSuite.setAttribute("name", Sheet);
				rootElementTest.setAttribute("name", testName);

				// Append Values to the root Elements
				rootElementSuite.appendChild(rootElementTest);
				rootElementTest.appendChild(rootElementClass);
				rootElementClass.appendChild(childElementClass);
				childElementClass.appendChild(rootElementGroups);

				// Obtain the column value flag ="Y" in a loop
				for (int elementC = 1; elementC <= flagCount; elementC++) {
					String element = "include";
					Element em = document.createElement(element);
					String[] flagElement = excel.flaggedMethods.get(elementC).toString().split(";");

					// Validate the className from XML with LinkedhashMap
					if (flagElement[2].equals(className)) {
						em.setAttribute("name", flagElement[0]);
						rootElementGroups.appendChild(em);
					}
				}
			}
			document.appendChild(rootElementSuite);
			// Generate the file
			FileWriter fstream = new FileWriter("Resources\\testng.xml");
			bw = new BufferedWriter(fstream);

			// Generate the required XML output file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);

			// Prints all the generated xml code in the File Object
			StreamResult result = new StreamResult(fstream);
			transformer.transform(source, result);

		} catch (DOMException dome) {
			dome.printStackTrace();
		} finally {
			if (bw != null) {
				// close the generated file
				bw.close();
			}
		}

	}

	public static void autoRunXml() {
		// Create a List
		List<String> files = new ArrayList<String>();
		// Add the required xml files to the list
		files.add("Resources\\testng.xml");
		// create object for TestNG
		TestNG tng = new TestNG();
		// Add a list of files to create a suite
		tng.setTestSuites(files);
		// Run the suite
		tng.run();
	}
}
