package basic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ssl_handling 
{
	public static void main(String[] args) throws IOException 
	{	
		// create object of chromeoptions class
		ChromeOptions options = new ChromeOptions();
		// for handle SSL
		options.setAcceptInsecureCerts(true);
		// launch browser
		WebDriver driver = new ChromeDriver(options);
		// maximize and put wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// open url"https://demo.guru99.com/"
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		driver.close();

	}	
	
	
	
}
