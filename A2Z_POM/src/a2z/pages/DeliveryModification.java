package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class DeliveryModification 
{
AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	public DeliveryModification(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void DeliveryModify(Properties obj) throws InterruptedException
	{
		// Click on Deliveries menu
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("Delivery_Menu"))).click();
				
		//Change time slot
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("Time_Slot"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("Morning"))).click();
		Thread.sleep(1000);
				
		if(driver.findElement(By.xpath(obj.getProperty("Delivery_Record"))).isDisplayed())
		{
		driver.findElements(By.xpath(obj.getProperty("Delivery_Confirmation"))).get(1).click();
		}
				
		Thread.sleep(2000);
				
		driver.findElements(By.xpath(obj.getProperty("Delivery_Record"))).get(17).click();
		
		Thread.sleep(2000);
		
		WebElement add=driver.findElement(By.xpath(obj.getProperty("Add_Circle")));
		add.click();
		add.click();
		
		WebElement remove=driver.findElement(By.xpath(obj.getProperty("Remove_Circle")));
		remove.click();
		remove.click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("Update_Confirm"))).click();
		
	}
	
	
}
