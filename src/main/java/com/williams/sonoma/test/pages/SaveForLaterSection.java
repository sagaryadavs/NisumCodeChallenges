package com.williams.sonoma.test.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.williams.sonoma.test.common.Global;
/**
 * This class is responsible to store Web elements on Save for Later page and operations performed on it which we have used in our entire framework.
 */
public class SaveForLaterSection {
	public SaveForLaterSection(){
		String SaveForLaterSectionIdentifier = "Empty Shopping Cart | Williams Sonoma";
		try {
			if (Global.driver.getTitle().contains(SaveForLaterSectionIdentifier)) {
					PageFactory.initElements(Global.driver, this);
					System.out.println("You are on Save For Later Section");
				}
				else {
					System.out.println("you are not on Save For Later Section, Sorry i can't continue...");
					Assert.fail("Save For Later Section not loaded..");
				}
		} catch (Exception e) {
		}
	}
}
