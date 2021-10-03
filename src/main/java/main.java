import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;

public class main extends Capabilities{

	public static void main(String[] args) throws MalformedURLException {
		// TODO satrt app
		AndroidDriver<AndroidElement> driver=baseCapabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");

		driver.findElement(By.cssSelector(".navbar-toggler")).click();

		driver.findElement(By.cssSelector("a[href*='products']")).click();

		JavascriptExecutor js= (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,1000)", "");

		String text =driver.findElement(By.xpath("(//li[@class='list-group-item'])[3]/div/div/a")).getText();

		Assert.assertEquals(text, "Devops");
		
				
		
	}

}
