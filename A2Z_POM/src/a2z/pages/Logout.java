package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Logout 
{
	AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	
	public Logout(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void LogoutApp(Properties obj) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Menu_Button"))).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(obj.getProperty("Logout_Menu"))).click();
		
		Thread.sleep(2000);
		
		String validation=driver.findElement(By.xpath(obj.getProperty("Hello"))).getText();
		
		if(driver.getPageSource().contains(validation))
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
	}
	
}
