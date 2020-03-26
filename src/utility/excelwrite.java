package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwrite {
static int c=0;
	public void write(String message)

   {
		File f= new File("TestData/excel.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
		    XSSFSheet sh =wb.getSheet("Sheet1");
		    XSSFRow row;
		    if(c==0)
		    {
		    row= sh.createRow(1);
		    }
		    else
		    {
		    row= sh.getRow(1);
		    }
		    XSSFCell cell =row.getCell(c);
		    cell.setCellValue(message);
		    
		    FileOutputStream fos= new FileOutputStream(f);
		    wb.write(fos);
		   // System.out.println(cell.getCellValue(c));
		    }
		
		 catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
   }
   }

