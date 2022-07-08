package com.datadriven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Nandhini Varadhan\\OneDrive\\Desktop\\Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println("I am String: " +stringCellValue);
			
		}
		
		else if(cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println("I am Numeric: " +numericCellValue);
			
		}
		
		System.out.println("********* ALL DATA *******");
		
		int size = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Row Size: " +size);

		
		for (int i = 0; i < size; i++) { // Row Loop
			
			Row row2 = sheetAt.getRow(i);
			int cell_count = row2.getPhysicalNumberOfCells();
			
			for (int j = 0; j < cell_count; j++) {//cell loop
				
				Cell cell2 = row2.getCell(j);
				
				String stringCellValue = cell2.getStringCellValue();
				System.out.println(stringCellValue);
				
				
			}
			
			System.out.println();
			
			
		}
		
		
	}

}
