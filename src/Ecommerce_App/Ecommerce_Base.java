package Ecommerce_App;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Ecommerce_Base {

	
	public static AndroidDriver capabilities() throws MalformedURLException
	{
		
		File f = new File("src");

		File fs = new File(f, "General-Store.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2 API 28");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability("chromedriverExecutable", "C:\\Appium Automation\\Pickright\\src\\chromedriver.exe");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
		
	}
}
