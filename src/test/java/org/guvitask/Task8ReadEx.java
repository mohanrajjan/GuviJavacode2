package org.guvitask;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task8ReadEx {

	public static void main(String[] args) throws IOException {
		//Referring to the file read and write
		File src = new File("Utils\\students.xlsx");
		//To read the file in the form of bytes
		FileInputStream fs = new FileInputStream(src);
		//opening the workbook
		XSSFWorkbook wk = new XSSFWorkbook(fs);
		//opening the sheet with the sheet name
		XSSFSheet sheet = wk.getSheet("Deatails");
		//reading the number of rows in the sheet
		int rowCount=sheet.getLastRowNum();
				//reading number of columns in the sheet
		int column = sheet.getRow(0).getLastCellNum();
		for(int i=0; i<=rowCount; i++) {
				for(int j=0;j<column;j++) {
					String data=sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(" " +data);
				}
				System.out.println();
		}

	
	}
	}
	
	
