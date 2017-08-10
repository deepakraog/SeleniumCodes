package com.drg.helpers;

import java.io.*;
import java.util.LinkedHashSet;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	String[][] arrayExcelData = null;

	public static LinkedHashSet<String> readXlsx(File inputFile) {
		try {
			FileInputStream fis = new FileInputStream(inputFile);
			// Get the workbook instance for XLSX file
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// Get first sheet from the workbook
			XSSFSheet sheet = wb.getSheetAt(0);

			for (int count = 1; count <= sheet.getLastRowNum(); count++) {
				XSSFRow row1 = sheet.getRow(count);
				lhs.add(row1.getCell(0).toString() + ":::" + row1.getCell(1).toString() + ":::"
						+ row1.getCell(2).toString() + ":::" + row1.getCell(3).toString() + ":::"
						+ row1.getCell(4).toString());

			}
		} catch (Exception e) {
			System.err.println("Exception :" + e.getMessage());
		}
		return lhs;
	}

	public static LinkedHashSet<String> readMethodsXlsx(File inputFile) {
		try {
			FileInputStream fis = new FileInputStream(inputFile);
			// Get the workbook instance for XLSX file
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// Get first sheet from the workbook
			XSSFSheet sheet = wb.getSheetAt(0);

			for (int count = 1; count <= sheet.getLastRowNum(); count++) {
				XSSFRow row1 = sheet.getRow(count);
				lhs.add(row1.getCell(0).toString() + ":::" + row1.getCell(1).toString());
			}
		} catch (Exception e) {
			System.err.println("Exception :" + e.getMessage());
		}
		return lhs;
	}

	public static LinkedHashSet<String> readXls(File inputFile) {
		try {

			FileInputStream fis = new FileInputStream(inputFile);
			// Get the workbook instance for XLS file
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			// Get first sheet from the workbook
			HSSFSheet sheet = workbook.getSheet("Sheet1");

			for (int count = 1; count <= sheet.getLastRowNum(); count++) {
				HSSFRow row1 = sheet.getRow(count);
				lhs.add(row1.getCell(0).toString() + ":::" + row1.getCell(1).toString() + ":::"
						+ row1.getCell(2).toString() + ":::" + row1.getCell(3).toString() + ":::"
						+ row1.getCell(4).toString());
			}

		}

		catch (FileNotFoundException e) {
			System.err.println("Exception" + e.getMessage());
		} catch (IOException e) {
			System.err.println("Exception" + e.getMessage());
		}
		return lhs;
	}

}