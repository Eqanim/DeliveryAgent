package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CollectionModification 
{
AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	public CollectionModification(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void CollectionModify(Properties obj) throws InterruptedException
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(obj.getProperty("Collection_Menu"))).click();
		
		Thread.sleep(5000);
		driver.findElements(By.xpath(obj.getProperty("Collection_Record"))).get(23).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Add_Circle"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Remove_Circle"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Update"))).click();
	}
}
