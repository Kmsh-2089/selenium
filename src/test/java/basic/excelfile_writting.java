package basic;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelfile_writting 
{
	//Exelfile-->workbook-->sheet-->rows--> cell
	 public static void main(String[] args) throws IOException
	 {
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("MYDATA");
		
		XSSFRow row1=sheet.createRow(0);
			row1.createCell(0).setCellValue("wardha");
			row1.createCell(1).setCellValue("arvinaka");
			row1.createCell(2).setCellValue("maharashtra");
		 
		XSSFRow row2=sheet.createRow(1);
			row2.createCell(0).setCellValue("nagpur");
			row2.createCell(1).setCellValue("shivajichauk");
			row2.createCell(2).setCellValue("maharashtra"); 
		 
		XSSFRow row3=sheet.createRow(2);
			row3.createCell(0).setCellValue("pune");
			row3.createCell(1).setCellValue("karvenagar");
			row3.createCell(2).setCellValue("maharashtra"); 
			
			workbook.write(file);
			System.out.println("file is created ...refresh and check testdata folder");
			workbook.close();
			file.close();
		 
		 
		 
	 }
	
	
}
