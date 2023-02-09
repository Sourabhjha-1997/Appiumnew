package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

public class Xpaths {
	AndroidDriver driver;
	public Xpaths(AndroidDriver driver) {
		this.driver=driver;
	}
	By box=By.id("kr.sira.unit:id/tab0_input");
	By seven=By.id("kr.sira.unit:id/tab0_num7");
	By eight=By.id("kr.sira.unit:id/tab0_num8");
	By text=By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[3]/android.widget.TextView");
	
	@Step
	public void box() {
	 WebElement ele=driver.findElement(box);
	 ele.click();
	}
	
	@Step
	public void sevenbutton() {
		WebElement elr=driver.findElement(seven);
		elr.click();
	}
	@Step
	public void eightbutton() {
		WebElement eli=driver.findElement(eight);
		eli.click();
	}
	@Step
	public void unitresult() {
		WebElement element = (WebElement) driver.findElement(text);
		String elText = element.getText();
		
		System.out.println(elText);


		
	}

}
