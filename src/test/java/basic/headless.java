package basic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless 
{
	public static void main(String[] args) throws IOException 
	{	
		// create object of chromeoptions class
		ChromeOptions options = new ChromeOptions();
		// call the method for headeless testing
		options.addArguments("--headless=new");

		/*Advanatages-we can do multiple tasks(since execution happend backend)
					-faster execution 
		DisAdvanatages- user cannot see the actions on the page, 
						so he connot understand flow/functionality/ of the test case */
	
		// launch browser
		WebDriver driver = new ChromeDriver(options);
		// maximize and put wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// open url"https://demo.guru99.com/"
		driver.get("https://demo.guru99.com/");
		System.out.println(driver.getTitle());
		driver.close();

	}	
}
