package com.drg.helpers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.cvas.qa.POM.searchOptions;
import com.cvas.qa.portalinfo.readProperties;
import com.drg.methodFlows.startUp;

import java.io.File;
import java.util.LinkedHashMap;

import jxl.*;

public class DataProviderInvoker {

	static String Path, SheetName, TestCase;
	static WebDriver driver;
	static {

		LinkedHashMap<String, String> in, inE;
		in = readProperties.driverDetails();
		inE = readProperties.inspectE();

		Path = in.get("XCEL_FILE_PATH");
		SheetName = inE.get("searchTag");
		TestCase = inE.get("searchCase");
	}

	@DataProvider(name = "DP1")
	public static Object[][] createData() throws Exception {

		Object[][] retObjArr = getTableArray(Path, SheetName, TestCase);
		return (retObjArr);
	}

	@Test(dataProvider = "DP1")
	public static void searchInputs(String TestCaseNo, String SearchString, String Contents, String XPath, String Bool)
			throws Exception {
		Thread.sleep(500);
		driver = startUp.driverInvok();
		System.out.println("Test inputs for Search " + TestCaseNo + " " + SearchString + " " + Contents + " " + XPath
				+ " " + Bool);
		searchOptions.searchResultsOption(TestCaseNo, SearchString, Contents, XPath, Bool, driver);

	}

	public static String[][] getTableArray(String xlFilePath, String sheetName, String tableName) throws Exception {
		String[][] tabArray = null;

		Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		int startRow, startCol, endRow, endCol, ci, cj;
		Cell tableStart = sheet.findCell(tableName);
		startRow = tableStart.getRow();
		startCol = tableStart.getColumn();

		Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1, 100, 64000, false);

		endRow = tableEnd.getRow();
		endCol = tableEnd.getColumn();

		//System.out.println("startRow=" + startRow + ", endRow=" + endRow + ", " + "startCol=" + startCol + ", endCol=" + endCol);
		
		tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
		ci = 0;

		for (int i = startRow + 1; i < endRow; i++, ci++) {
			cj = 0;
			for (int j = startCol + 1; j < endCol; j++, cj++) {
				tabArray[ci][cj] = sheet.getCell(j, i).getContents();
			}
		}

		return (tabArray);
	}

}
