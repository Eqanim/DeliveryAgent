package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class ShuffleCustomer 
{
	AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	
	public ShuffleCustomer(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void ShufflingCustomer(Properties obj) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Menu_Button"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Assign_Customer_Menu"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("Customer_Button"))).click();
		
		Thread.sleep(2000);
		WebElement source=driver.findElements(By.xpath(obj.getProperty("Shuffle_button"))).get(2);
		
		WebElement target =driver.findElements(By.xpath(obj.getProperty("Shuffle_button"))).get(1);
		
		
		TouchAction action=new TouchAction((MobileDriver)driver);
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
	}
}
