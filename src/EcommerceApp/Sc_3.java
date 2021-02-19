package EcommerceApp;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Ecommerce_App.Ecommerce_Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Sc_3 extends Ecommerce_Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hell");
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		driver.findElementByAndroidUIAutomator("text(\"Argentina\")").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		driver
        .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().text(\"Converse All Star\"));");
		List<AndroidElement> w = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));
		int n=w.size();
		
		for(int i=0;i<n;i++)
		{
			if(w.get(i).getText().equals("Converse All Star"))
			{
				driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
				
				break;
			}

		}
		
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		String lastPageText=driver.findElementById("com.androidsample.generalstore:id/productName").getText();
		if("Converse All Star"==lastPageText)
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
		

		
		

	}

}
