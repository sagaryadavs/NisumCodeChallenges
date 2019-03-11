package com.williams.sonoma.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.williams.sonoma.test.common.Global;
/**
 * This class is responsible to store Web elements on Shopping Cart page and operations performed on it which we have used in our entire framework.
 */
public class ShoppingCartSection {
	public ShoppingCartSection(){
		String ShoppingCartSectionIdentifier = "Shopping Cart | Williams Sonoma";
		try {
			if (Global.driver.getTitle().contains(ShoppingCartSectionIdentifier)) {
					PageFactory.initElements(Global.driver, this);
					System.out.println("You are on Shopping Cart Section");
				}
				else {
					System.out.println("you are not on Shopping Cart Section, Sorry i can't continue...");
					Assert.fail("Shopping Cart Section not loaded..");
				}
		} catch (Exception e) {
		}
	}
	@FindBy(xpath="//a[@class='moveToSFL save-for-later-link']")
	WebElement saveForLatrBtn;
	/**
	 * Method saveForLater is responsible for moving the product to 'Save For Later' section.
	 */
	public SaveForLaterSection saveForLater(){
		PageFactory.initElements(Global.driver, this);
		this.saveForLatrBtn.click();
		return new SaveForLaterSection();
	}
}