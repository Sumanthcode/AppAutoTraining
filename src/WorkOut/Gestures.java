package WorkOut;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class Gestures  extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capablities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement w = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		//w.click();
		//tap
		TouchAction touch=new TouchAction(driver);
		touch.tap(tapOptions().withElement(element(w))).perform();	
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		AndroidElement w1 = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touch.longPress(longPressOptions().withElement(element(w1)).withDuration(ofSeconds(2))).release().perform();
		
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		

	}

}
