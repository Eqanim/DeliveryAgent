package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class MulDeliveryConfirm 
{
		AndroidDriver<WebElement> driver;
		
		public Properties initial() throws IOException
		{
		Properties obj = new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
		obj.load(fis);
		return obj;
		}
		
		public MulDeliveryConfirm(AndroidDriver<WebElement> driver)
		{
			this.driver=driver;
		}
		
		

		public void mulDeliveryConfirmation(Properties obj) throws InterruptedException
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
			driver.findElement(By.xpath(obj.getProperty("Delivery_Confirmation"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(obj.getProperty("CheckBox"))).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(obj.getProperty("Confirm_Deliveries"))).click();
			Thread.sleep(2000);
			
			String pending=driver.findElement(By.xpath(obj.getProperty("Pending_Tab"))).getText();
			
			if(pending.equalsIgnoreCase("0 Pending "))
			{
				System.out.println("Test case Passed");
			}
			else
			{
				System.out.println("Test Case Failed");
			}
		}
	}

