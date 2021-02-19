package EcommerceApp;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Ecommerce_App.Ecommerce_Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Sc_4 extends Ecommerce_Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		 AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hell");
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		driver.findElementByAndroidUIAutomator("text(\"Argentina\")").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		 driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		 driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		 driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		 Thread.sleep(3000);
		List<AndroidElement> prices = driver.findElementsById("com.androidsample.generalstore:id/productPrice");
		
		double sum=0;
		for(int i=0;i<prices.size();i++)
		{
			sum=sum+Double.parseDouble(prices.get(i).getText().replace("$",""));
			
		}
		double total = Double.parseDouble(driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl")
.getText().replace("$",""));		
		if(sum==total)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
			

	}

}
