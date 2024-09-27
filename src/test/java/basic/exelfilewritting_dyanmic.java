package basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exelfilewritting_dyanmic 
{
	
	
		//Exelfile-->workbook-->sheet-->rows--> cell
		 public static void main(String[] args) throws IOException
		 {
			FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfiledyanmic.xlsx");
			
			XSSFWorkbook workbook=new XSSFWorkbook();
			
			XSSFSheet sheet=workbook.createSheet("DYANAMIC");
			
			// to get the dyanamic data from the user 
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the no of rows");
			int totalrows=sc.nextInt();
			System.out.println("enter the no of cell");
			int totalcell=sc.nextInt();
			
			for(int r=0;r<=totalrows;r++) 
			{
				XSSFRow currentrow=sheet.createRow(r);
				for(int c=0;c<totalcell;c++) 
				{
					XSSFCell cell=currentrow.createCell(c);
					cell.setCellValue(sc.next());
				}
			}
			
				workbook.write(file);
				System.out.println("file is created ...refresh and check testdata folder");
				workbook.close();
				file.close();
			 
	
		 }
}
