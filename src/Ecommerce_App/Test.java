package Ecommerce_App;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class Test extends Ecommerce_Base {

	public static void main(String[] args) throws MalformedURLException {
		
		  AndroidDriver driver = capabilities();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.findElementById("com.androidsample.generalstore:id/nameField").
		  sendKeys("Hello"); driver.hideKeyboard();
		  driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").
		  click();
		  driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").
		  click(); driver.
		  findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"
		  );
		  
		  // driver.findElement(MobileBy.
		//  AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""
		//  + containedText + "\").instance(0))"));
		  
		  driver.findElementByAndroidUIAutomator("text(\"Argentina\")").click();
		  driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click
		  ();
		  
		  System.out.println(driver.findElementByTagName("android.widget.toast[1]").
		  getText());
		 

	}

}
