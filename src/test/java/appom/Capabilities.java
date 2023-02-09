package appom;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {
	static AndroidDriver driver;
	 public static ThreadLocal<AndroidDriver> tdriver = new ThreadLocal<AndroidDriver>();
	 public AndroidDriver initialize_driver() throws InterruptedException, MalformedURLException{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
	dc.setCapability(MobileCapabilityType.APP, "C:\\New folder\\Calculator.apk");
	//dc.setCapability(MobileCapabilityType.APP, "C:\\New folder\\Calculator.apk");
	dc.setCapability("appPackage", "kr.sira.unit");
	dc.setCapability("appActivity", "kr.sira.unit.Intro");
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	 driver=new AndroidDriver(url,dc);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 tdriver.set(driver);
		return getDriver();
	 }
	 public static synchronized AndroidDriver getDriver() {
			return tdriver.get();
		}
	

}
