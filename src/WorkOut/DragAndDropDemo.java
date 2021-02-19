package WorkOut;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDropDemo extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capablities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		AndroidElement w = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		AndroidElement w1 = driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		TouchAction t=new TouchAction(driver);;
	//	t.longPress(longPressOptions().withElement(element(w))).moveTo(element(w1)).release().perform();
		//or
		t.longPress(element(w)).moveTo(element(w1)).release().perform();
		
		

	}

}
