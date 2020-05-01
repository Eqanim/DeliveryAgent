package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class InvalidEditProfile 
{
	AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	public InvalidEditProfile(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void MenuButton(Properties obj)
	{
		driver.findElement(By.xpath(obj.getProperty("Menu_Button"))).click();
	}
	
	public void ProfileMenu(Properties obj) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("Profile_Menu"))).click();
	}
	
	public void EditingProfile(Properties obj) throws InterruptedException
	{
		Thread.sleep(3000);
		
	//editing name
	driver.findElements(By.xpath(obj.getProperty("Name"))).get(1).clear();
	Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("Name"))).get(1).sendKeys("1234");
		
		//editing Flat No
		driver.findElements(By.xpath(obj.getProperty("Flat_No"))).get(2).clear();
		Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("Flat_No"))).get(2).sendKeys("F@#12");
		
		//editing Detail Address
		driver.findElements(By.xpath(obj.getProperty("Detail_Add"))).get(3).clear();
		Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("Detail_Add"))).get(3).sendKeys("12345");
		
		//editing Landmark
		driver.findElements(By.xpath(obj.getProperty("Landmark"))).get(4).clear();
		Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("Landmark"))).get(4).sendKeys("@#123");
				
		//editing Pin code
		driver.findElements(By.xpath(obj.getProperty("Pin_code"))).get(5).clear();
		Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("Pin_code"))).get(5).sendKeys("abcdef");
		
		//editing Area
		driver.findElements(By.xpath(obj.getProperty("Area"))).get(6).clear();
		Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("Area"))).get(6).sendKeys("23@#");
		
		//editing State
		Thread.sleep(3000);
		driver.findElements(By.xpath(obj.getProperty("State"))).get(0).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("Maharashtra"))).click();
		Thread.sleep(1000);
		
		//editing City
		Thread.sleep(3000);
		driver.findElements(By.xpath(obj.getProperty("City"))).get(1).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("Nagpur"))).click();
		
		//vertical scrolling
		//store all element on page
		AndroidElement list=(AndroidElement) driver.findElement(By.xpath(obj.getProperty("common")));
		
		//scrolling upto elemnt
		MobileElement listitem= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
				+ "new UiSelector().textContains (\"Alternate No.\").instance(0))"));
		
		
		//editing Email id
		driver.findElements(By.xpath(obj.getProperty("Email"))).get(7).clear();
		Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("Email"))).get(7).sendKeys("pqr@email");
		
		//editing Mobile No
		driver.findElements(By.xpath(obj.getProperty("Email"))).get(8).clear();
		Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("Email"))).get(8).sendKeys("8830549747");
		
		//editing Alternate No
		driver.findElements(By.xpath(obj.getProperty("Email"))).get(9).clear();
		Thread.sleep(1000);
		driver.findElements(By.xpath(obj.getProperty("Email"))).get(9).sendKeys("0000000000");
		
		//Click on Update button
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("Update_button"))).click();
}
}
