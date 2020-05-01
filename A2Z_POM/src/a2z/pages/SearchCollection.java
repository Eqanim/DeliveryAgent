package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class SearchCollection 
{
AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	public SearchCollection(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void Searching(Properties obj) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Collection_Menu"))).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("Search_button"))).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("Search_Area"))).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("Search_Area"))).sendKeys("Water");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(obj.getProperty("Back_Arrow"))).click();
	}
}
