package a2z.Testcases;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import a2z.pages.FAQ;
import a2z.pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FAQTest 
{
	@Test
	public void FAQMethod() throws InterruptedException, IOException
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
	
		
		LoginPage login=new LoginPage(driver);
		
		login.MobileNo(login.initial());
		login.SendOtpButton(login.initial());
		login.OtpNo(login.initial());
		login.SignInButton(login.initial());
		
		FAQ faq=new FAQ(driver);
		faq.FAQMenu(faq.initial());
	}
}
