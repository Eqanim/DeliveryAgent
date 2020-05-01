package a2z.pages;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.collections.Lists;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.net.URL;
import java.time.Duration;



public class SingleDeliveryCancel 
{
	AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	public SingleDeliveryCancel(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void singleDeliveryCancellation(Properties obj) throws InterruptedException
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
				WebElement ele=driver.findElements(By.xpath(obj.getProperty("Delivery_Record"))).get(10);
				
				Thread.sleep(1000);		
				
				ele.click();
				
				
								
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				


							
	}
		
	}
	

