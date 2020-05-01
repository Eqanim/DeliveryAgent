package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SingleDeliveryConfirm 
{
	AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	public SingleDeliveryConfirm(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void singleDeliveryConfirmation(Properties obj) throws InterruptedException
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
		
		
		WebElement Panel =driver.findElements(By.xpath(obj.getProperty("Delivery_Record"))).get(17);
		
		org.openqa.selenium.Dimension dimension= Panel.getSize();
		
		int Anchor = Panel.getSize().getHeight()/2;
		
		Double Screewidthstart =dimension.getWidth()*0.8;
		int scrollStart = Screewidthstart.intValue();
		
		Double Screewidthend =dimension.getWidth()*0.5;
		int scrollend = Screewidthend.intValue();
		
		
		
		new TouchAction((PerformsTouchActions) driver)
		.press(PointOption.point(scrollStart, Anchor))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(scrollend,Anchor))
		.release().perform();

		Thread.sleep(3000);
	}
	
}
