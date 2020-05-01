package a2z.Testcases;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import a2z.pages.InvalidLogin;
import a2z.pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InvalidLoginTest 
{
	@Test
	public void Invalidlogin() throws InterruptedException, IOException
	{
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		dc.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");

		dc.setCapability("appPackage", "com.eqanim.eqanim.tech");
		dc.setCapability("appActivity", "com.eqanim.eqanim.tech.MainActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement> (url,dc);

		Thread.sleep(8000);
	
		
		InvalidLogin login=new InvalidLogin(driver);
		
		login.MobileNo(login.initial());
		login.SendOtpButton(login.initial());
		login.OtpNo(login.initial());
		login.SignInButton(login.initial());
		
		WebElement result=driver.findElement(By.xpath("//android.view.View[@text = 'Dashboard']"));
		
		if(result.getText().equalsIgnoreCase("Dashboard"))
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
	}
}
