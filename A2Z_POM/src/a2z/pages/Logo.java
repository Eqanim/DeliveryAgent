package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Logo 
{
	AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	
	public Logo(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void LogoVerify(Properties obj) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Menu_Button"))).click();
		
		Thread.sleep(2000);
		
		String version1=driver.findElement(By.xpath(obj.getProperty("Version"))).getText();
		//String poweredBy1=driver.findElement(By.xpath(obj.getProperty("Powered_By"))).getText();
		
		
		if(version1.equalsIgnoreCase("Version: 0.1.24"))
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
	}
	
}
