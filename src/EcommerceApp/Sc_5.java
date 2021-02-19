package EcommerceApp;


import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Ecommerce_App.Ecommerce_Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class Sc_5 extends Ecommerce_Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
			
			driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hell");
			driver.hideKeyboard();
			driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
			driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
			driver.findElementByAndroidUIAutomator("text(\"Argentina\")").click();
			driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
			
			 driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
			 driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
			 Thread.sleep(3000);
			 AndroidElement w1 = driver.findElementByAndroidUIAutomator("text(\"Send me e-mails on discounts related to selected products in future\")");
			 AndroidElement w2 = driver.findElementById("com.androidsample.generalstore:id/termsButton");
			 TouchAction touch=new TouchAction(driver);
			 touch.tap(tapOptions().withElement(element(w1))).perform();
			 touch.longPress(longPressOptions().withElement(element(w2))).perform();
			 driver.findElementByAndroidUIAutomator("text(\"CLOSE\")").click();
			 driver.findElementByAndroidUIAutomator("text(\"Visit to the website to complete purchase\")").click();
			 Thread.sleep(7000);
			 Set<String> context = driver.getContextHandles();
			
			 for(String c : context )
			 {
				System.out.println(c);
			 }
			 driver.context("WEBVIEW_com.androidsample.generalstore");
			 
			 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("hello");

	}

}
