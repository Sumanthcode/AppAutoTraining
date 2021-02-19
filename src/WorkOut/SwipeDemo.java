package WorkOut;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capablities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
	//	driver.findElementByAndroidUIAutomator("content-desc(\"9\")").click(); did't work out
		
		driver.findElementByXPath("//*[@content-desc='9']").click();
		AndroidElement w = driver.findElementByXPath("//*[@content-desc='15']");
		AndroidElement w1 = driver.findElementByXPath("//*[@content-desc='45']");
		TouchAction t=new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(w)).withDuration(ofSeconds(2))).moveTo(element(w1)).release().perform();
		
		
		
		

	}

}
