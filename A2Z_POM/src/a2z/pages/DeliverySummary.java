package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class DeliverySummary
{
	AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	public DeliverySummary(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void ViewDeliverySummary(Properties obj) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Delivery_Menu"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Date"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Date_toChoose"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Time_Slot"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Morning"))).click();
		
		
	}
}
