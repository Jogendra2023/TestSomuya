package com.wallmonkey.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadfromExcelbykeyvale {

	public static void main(String[] args) 
	{
		try
		{
		String path = "C:\\Users\\jogendras\\eclipse-workspace\\Wallmonkey\\src\\main\\resources\\TestData.xlsx";
		String rowkey="Verify Home page";
		String Cellkey="Description";
		File fp = new File(path);
		FileInputStream fis = new FileInputStream(fp);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("TestCase");
		int rowcount = sh.getPhysicalNumberOfRows();
		
			for(int i =0; i<rowcount; i++)
			{
				Row rw = sh.getRow(i);
				if(rw.getCell(0).toString().equals(rowkey))
				{
				int colcount = rw.getPhysicalNumberOfCells();
				for(int j=0; j<colcount;j++)
				{
					String cellvalue = sh.getRow(0).getCell(j).toString();
					if(cellvalue.equalsIgnoreCase(Cellkey))
					{
						String result = sh.getRow(i).getCell(j).toString();
						System.out.println("Test Case :  " +result);
					}
				}
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found" +e);
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("Input Output Exception" +e);
			e.printStackTrace();
		}

	}

}
