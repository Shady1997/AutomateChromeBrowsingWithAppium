import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	public static AndroidDriver<AndroidElement> baseCapabilities() throws MalformedURLException {
		
		// TODO Declare DesiredCapabilites to automate with android OS

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy J5");

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator1");

		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
		capabilities.setCapability("chromedriverExecutable","C:\\webdrivers\\chromedriver.exe");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		return driver;
	}

}
