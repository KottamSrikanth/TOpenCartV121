package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Utilitiess 
{
	@Test
	public static void readDataFromExcel() throws IOException
	{
		//Read Data from Excel
		File file = new File("C:\\Users\\srika\\eclipse-workspace\\TOpenCartV121\\testData\\OpenCartLoginDetails.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows=sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(0).getLastCellNum();
		for(int r=1;r<rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<columns;c++)
			{
				XSSFCell cell=row.getCell(c);
				System.out.print(cell.toString()+" || ");
			}
			System.out.println();
		}
		System.out.println(rows);
		System.out.println(columns);
	}

}
