package WorkOut;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridDivice {
	public static AndroidDriver capablities(String device) throws MalformedURLException {
	
	File f = new File("src");

	File fs = new File(f, "ApiDemos-debug.apk");

	DesiredCapabilities cap = new DesiredCapabilities();

	if(device.equals("Emulator"))
	{
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 28"); // Emulator
	}
	else if(device.equals("Android Device"))
	{
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RMX1801"); // real device
	}

	

	// cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");

	// cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");

	//cap.setCapability(MobileCapabilityType.VERSION, "9.0");

	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

	// cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"API Demos");

	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

	AndroidDriver driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	
	
	return driver;
}

}
