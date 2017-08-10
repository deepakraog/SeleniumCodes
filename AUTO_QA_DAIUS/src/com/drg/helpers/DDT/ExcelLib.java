package com.drg.helpers.DDT;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import com.drg.helpers.ExcelReader;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelLib {

	static Sheet wrkSheet;
	static Workbook wrkbook = null;
	static Hashtable<String, Integer> dict = new Hashtable<String, Integer>();
	static Hashtable<Integer, String> flaggedMethods = new Hashtable<Integer, String>();
	static LinkedHashMap<String, String> nameClassTest = new LinkedHashMap<String, String>();
	static LinkedHashSet<String> lhs;
	static LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
	
	// Create a constructor
	public ExcelLib(String ExcelSheetPath,String Sheet) throws BiffException, IOException {
		wrkbook = Workbook.getWorkbook(new File(ExcelSheetPath));
		wrkSheet = wrkbook.getSheet(Sheet);
		System.out.println("inside ExcelLib");
	}

	// Returns the Number of rows
	public static int RowCount() {
		return wrkSheet.getRows();
	}

	// Returns the cell value by taking row and column values as argument
	public static String ReadCell(int column, int row) {
		return wrkSheet.getCell(column, row).getContents();
	}

	public static String ReadCell(String columnName, int rowNumber) {
		return ReadCell(GetCell(columnName), rowNumber);
	}

	// Create column dictionary to hold all the column Names
	@SuppressWarnings("boxing")
	public static void ColumnDictionary() {
		for (int col = 0; col < wrkSheet.getColumns(); col++) {
			dict.put(ReadCell(col, 0), col);
		}

	}

	// Read Column names
	public static int GetCell(String colName) {
		try {
			int value;
			value = ((Integer) dict.get(colName)).intValue();
			return value;
		} catch (NullPointerException e) {
			return (0);
		}

	}

	@SuppressWarnings("boxing")
	public Hashtable<Integer, String> GetFlaggedMethods(String columnName) {
		int methodcount = 1;// keycount flag will keep track of method count
		for (int row = 0; row < RowCount(); row++) {
			if (ReadCell(columnName, row).equals("Y")) {
				// put method keycount and method name
				flaggedMethods.put(methodcount, ReadCell("Function", row) + ";" + ReadCell("ExcelName", row) + ";"
						+ ReadCell("FQCN", row) + ";" + ReadCell("TestName", row));
				methodcount++;
			}
		}
		return flaggedMethods;
	}

	public LinkedHashMap<String, String> GetFlaggedClasses() {
		for (int elementC = 1; elementC <= flaggedMethods.size(); elementC++) {
			@SuppressWarnings("boxing")
			String[] flagElement = flaggedMethods.get(elementC).toString().split(";");
			nameClassTest.put(flagElement[2], flagElement[3]);
		}
		return nameClassTest;
	}
	
	public static LinkedHashMap<String,String> testMethodInput(String inputFiles){	
		lhs = ExcelReader.readMethodsXlsx(new File(inputFiles));
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()){
			String[] item = itr.next().split(":::");	
			lhm.put(item[0], item[1]);
		}
		return lhm;
	}
	
}