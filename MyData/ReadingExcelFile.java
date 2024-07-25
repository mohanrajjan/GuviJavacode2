package com.guvi.general;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		File src = new File("Utils\\mydata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(src);

		XSSFSheet sheet1 = workbook.getSheetAt(0);

		int size = sheet1.getLastRowNum(); // reads the number of total rows in the sheet

		for (int i = 0; i <= size; i++) {
			String browser = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(browser);
		}
		workbook.close();

	}

}
