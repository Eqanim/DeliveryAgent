package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ContactUs 
{
	AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	
	public ContactUs(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void ContactUsMenu(Properties obj) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Support_Menu"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Contact_Us"))).click();
		
		
		// Mail id
		Thread.sleep(2000);
		driver.findElements(By.xpath(obj.getProperty("Contact_Email"))).get(2).click();
		
		Thread.sleep(2000);
		driver.findElements(By.xpath(obj.getProperty("Gmail_Menu"))).get(1).click();
		
		
		// Contact number
		Thread.sleep(2000);
		driver.findElements(By.xpath(obj.getProperty("Contact_Number"))).get(1).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Allow"))).click();
		
	}
}
