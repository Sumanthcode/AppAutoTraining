package MobileChromeBrowsee;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class Browse extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver = capablities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("http://www.facebook.com");

	}

}
