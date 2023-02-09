package base;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import appom.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import locators.Xpaths;

@Listeners({listners.Listner.class})
public class Testcases extends Capabilities {
	public AndroidDriver driver;
	Xpaths path;
	Capabilities cap;
	
	
	@BeforeClass
	public void before() throws MalformedURLException, InterruptedException {
		cap=new Capabilities();
		driver = cap.initialize_driver();
		path=new Xpaths(driver);
		
	}
	@Test(description="Automate Unit Converter")
	@Description("Test on QA_Services")
	@Step("Trigger Application Url ")
	public void testpage() throws InterruptedException {
		Thread.sleep(6000);
		path.box();
		Thread.sleep(4000);
		path.sevenbutton();
		Thread.sleep(4000);
		path.eightbutton();
		System.out.println("hii");
		//path.unitresult();
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	

}
