package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class FAQ 
{
	AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	
	public FAQ(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void FAQMenu(Properties obj) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Support_Menu"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("FAQ"))).click();
		
		Thread.sleep(2000);
		driver.findElements(By.xpath(obj.getProperty("FAQ_Question"))).get(16).click();
		
		Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("FAQ_Question"))).get(16).click();
	}
}
