package org.guvitask;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task8Excel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		File src = new File("Utils\\students.xlsx");
		//creating work book
		XSSFWorkbook wk= new XSSFWorkbook();
		//creating new work sheet
		XSSFSheet sheet1 = wk.createSheet("Details");
		//creating the row
		XSSFRow row1 = sheet1.createRow(0);
		//sending data to the cell
		row1.createCell(0).setCellValue("Name");
		row1.createCell(1).setCellValue("Age");
		row1.createCell(2).setCellValue("Email");
		
		XSSFRow row2 = sheet1.createRow(1);
		row2.createCell(0).setCellValue("John Doe");
		row2.createCell(1).setCellValue("30");
		row2.createCell(2).setCellValue("John@test.com");
		
		XSSFRow row3 = sheet1.createRow(2);
		row3.createCell(0).setCellValue("Jane Doe");
		row3.createCell(1).setCellValue("28");
		row3.createCell(2).setCellValue("John@test.com");
		
		XSSFRow row4 = sheet1.createRow(3);
		row4.createCell(0).setCellValue("Bob Smith");
		row4.createCell(1).setCellValue("35");
		row4.createCell(2).setCellValue("jacky@example.com");

		XSSFRow row5 = sheet1.createRow(4);
		row5.createCell(0).setCellValue("Swapnil");
		row5.createCell(1).setCellValue("37");
		row5.createCell(2).setCellValue("swapnil@example.com");
		
		//setting up output byte stream
		FileOutputStream fo = new FileOutputStream(src);
		//writing to the workbook
		wk.write(fo);
		
	}

}
