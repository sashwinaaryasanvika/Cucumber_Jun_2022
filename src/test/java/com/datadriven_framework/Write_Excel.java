package com.datadriven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Nandhini Varadhan\\OneDrive\\Desktop\\Datadriven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		//WB
		Workbook wb=new XSSFWorkbook();
		Sheet createSheet = wb.createSheet("StudentData");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("UserName");
		
		wb.getSheet("StudentData").createRow(1);
		wb.getSheet("StudentData").createRow(2);
		
		wb.getSheet("StudentData").getRow(1).createCell(2).setCellValue("Selenium1");
		wb.getSheet("StudentData").getRow(1).createCell(0).setCellValue("Priya");
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		
		System.out.println("Inserted Successfully");
		
		
		
		
		
		
		
		
	}

}
