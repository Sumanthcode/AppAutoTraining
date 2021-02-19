package EcommerceApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import Ecommerce_App.Ecommerce_Base;
import io.appium.java_client.android.AndroidDriver;

public class SC_2 extends Ecommerce_Base{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
//	System.out.println(driver.findElementByTagName("android.widget.Toast[1]").getText()); //did't work
	System.out.println(driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name"));
	
	
	
	
	}

}
