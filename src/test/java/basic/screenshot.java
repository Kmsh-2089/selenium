package basic;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class screenshot 
{
	//launch browser
	//open url"https://demo.guru99.com/"
	//click on insurance project 
	//take the screenshot of logo
	// try full page scrennshot
	//closed the browser
	public static void main(String[] args) throws IOException 
	{
		//launch browser
		WebDriver driver= new ChromeDriver();
		//maximize and put wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//open url"https://demo.guru99.com/"
		driver.get("https://demo.guru99.com/");
		
		// try full page scrennshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File target= new File(System.getProperty("user.dir")+"\\screenshot\\guru99full.png");
		 FileHandler.copy(src, target);
		 //src.renameTo(target);
		
		 //click on insurance project 
		driver.findElement(By.xpath("//a[text()='Insurance Project']")).click();
		
		//take the screenshot of logo
		 WebElement logo=driver.findElement(By.xpath("//div[@class='logo']"));
		 File source=logo.getScreenshotAs(OutputType.FILE);
		 File destination = new File(System.getProperty("user.dir")+"\\screenshot\\guru99.png");
		 FileHandler.copy(source, destination);
		// source.renameTo(destination);
		//closed the browser
		 driver.close();
	}	
}
