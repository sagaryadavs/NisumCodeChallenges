package com.williams.sonoma.test.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.williams.sonoma.test.pages.HomeSection;
/**
 * This class is responsible to store all the common methods or operations which we have used in our entire framework.
 */
public class CommonUtils {
	/**
	 * Method enterUrl is responsible for open the project URL which we have used in our entire framework.
	 * @return HomeSection
	 */
	public HomeSection enterUrl(){
		Global.driver.get(CONSTANT.proUrl);
		return new HomeSection();
	}
	/**
	 * Method scrollBy is responsible to scroll on given x and y coordinate.
	 */
	public void scrollBy(){
		JavascriptExecutor je = (JavascriptExecutor)Global.driver;
		je.executeScript("Window.scrollBy(0,200)","");
	}
	/**
	 * Method scrollIntoView is responsible to scroll until the element comes in view.
	 */
	public void scrollIntoView(WebElement element){
		JavascriptExecutor je = (JavascriptExecutor)Global.driver;
		je.executeScript("arguments[0].click();", element);
	}
}