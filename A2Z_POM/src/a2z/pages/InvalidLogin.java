package a2z.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class InvalidLogin 
{
AndroidDriver<WebElement> driver;
	
	public Properties initial() throws IOException
	{
	Properties obj = new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\A2Z_POM\\Properties\\config.properties");
	obj.load(fis);
	return obj;
	}
	
	
	public InvalidLogin(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public void MobileNo(Properties obj) throws InterruptedException
	{
		driver.findElement(By.xpath(obj.getProperty("Mobile_Number"))).click();

		WebElement mobno= driver.findElement(By.xpath(obj.getProperty("Mobile_Number")));  // mobile number
		mobno.sendKeys("9503442111");

		Thread.sleep(3000);
	}
	
	public void SendOtpButton(Properties obj) throws InterruptedException
	{
		driver.findElement(By.xpath(obj.getProperty("Send_OTP"))).click();  // send otp

		Thread.sleep(7000);
	}
	
	public void OtpNo(Properties obj) throws InterruptedException
	{
		driver.findElements(By.xpath(obj.getProperty("OTP"))).get(1).sendKeys("1234");
		Thread.sleep(3000);
	}
	
	public void SignInButton(Properties obj) throws InterruptedException
	{
		driver.findElement(By.xpath(obj.getProperty("Sign_in"))).click();
		Thread.sleep(3000);
	}
}
