package basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class register_guru99 
{
	public static void main(String[] args) 
	{
		// launch browser
		WebDriver driver= new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// apply wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// open url 
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		// click on regiser button
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		// fill the entire form and then log in 
		
		// select initial
		selectfromlistbox(driver,By.id("user_title"),"Mr");
		// enter name
		driver.findElement(By.id("user_firstname")).sendKeys("kamesh");
		// enter surname
		driver.findElement(By.id("user_surname")).sendKeys("vaidya");
		//enter phone
		driver.findElement(By.id("user_phone")).sendKeys("8888518793");
		//select DOB
		// year
		selectfromlistbox(driver, By.id("user_dateofbirth_1i"), "1995");
		//month
		selectfromlistbox(driver, By.id("user_dateofbirth_2i"), "August");
		//date
		selectfromlistbox(driver, By.id("user_dateofbirth_3i"), "20");
		
		// select ckeck box
		driver.findElement(By.id("licencetype_t"));
		//select licence period
		selectfromlistbox(driver, By.id("user_licenceperiod"),"5");
		//select occupation 
		selectfromlistbox(driver, By.id("user_occupation_id"), "Engineer");
		// address street
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("sudershan nagar");
		//city
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("pune");
		//country
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("India");
		//post code
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("442001");
		//email
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("vaidyakamesh@gmail.com");
		//password
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("Kmsh@2089");
		// confirm password
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("Kmsh@2089");
		// click on create
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// closed the browser
		driver.quit();
		
		
	}
	// as we have 5 list box then make a user define method 
	public static void selectfromlistbox(WebDriver driver, By listboxloactor, String visibleText) 
	{
		// find the listbox element
		WebElement listboxEelement=driver.findElement(listboxloactor);
		
		// create select class object 
		Select listbox=new Select(listboxEelement);
		
		//select it by visible text
		listbox.selectByVisibleText(visibleText);
	}
	
	
	
	
}
