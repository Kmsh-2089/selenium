package basic;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class class1 
{
	public static void main(String[] args) 
	{
		//launch browser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		//mazimise
		driver.manage().window().maximize();
		// apply wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// open url 
		driver.get("https://demo.guru99.com/");
		// get title
		 String title=driver.getTitle();
		 System.out.println(title);
		 // validate
		 if(title.equals("Guru99 Bank Home Page")) 
		 {
			 System.out.println("test passed");
		 }
		 else
		 {
			 System.out.println("test falied");
		 }
		
		 // now closed the browser
		 driver.close();
		
	}
}
