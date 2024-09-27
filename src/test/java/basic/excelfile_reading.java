package basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelfile_reading 

//Exelfile-->workbook-->sheet-->rows--> cell
{
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Book1.xlsx");
		// open the workbook
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		// open the perticular sheet
		XSSFSheet sheet=workbook.getSheet("sheet1");
		// to get the total row count 
		 int totalrow=sheet.getLastRowNum();
		 // to get the total cell count
		 int totalcell=sheet.getRow(1).getLastCellNum();
		 // print the rows and cell 
		 System.out.println("no of rows"+"\t"+totalrow);
		 System.out.println("no of cell"+"\t"+totalcell);
		 
		 // to read the data row_wise
		 for(int r=0;r<=totalrow;r++) // for rows 
		 {
			 XSSFRow currentrow=sheet.getRow(r);
			 for(int c=0;c<totalcell;c++) // for cell/ column
			 {
				 XSSFCell cell=currentrow.getCell(c);
				 System.out.print(cell.toString()+"\t");
			 }
			 System.out.println();
		 }
		workbook.close();
		file.close();
		
		
		
		
	}
	
	
	
	
	
	
	
}
