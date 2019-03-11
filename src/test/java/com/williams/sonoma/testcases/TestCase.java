package com.williams.sonoma.testcases;

import org.testng.annotations.Test;
import com.williams.sonoma.test.common.Global;

public class TestCase {
	
	@Test
	public void testSaveForLater() throws Exception{
		 
		 Global.baseClass.invokeBrowser("chrome");
		 Global.commonUtils.enterUrl();

		 Global.homeSection.moveToCookWareLnk();
		 Global.homeSection.viewTeaKettleSection();
 
		 Global.teaKettleSection.minimizeDialogBox();
		 Global.teaKettleSection.viewKettleDetails();
	 
		 Global.kettleDetailsSection.addToCart();
		 Global.kettleDetailsSection.checkOut();
		 Global.shoppingCartSection.saveForLater();
	}
	/**
	 * Method verifyProductSavedForLater is responsible to verify the selected product saved for later or not.
	*/
	@Test(dependsOnMethods = {"testSaveForLater"})
	 public void verifyProductSavedForLater(){
		
			if(Global.teaKettleSection.selectKettle.isDisplayed()){
				System.out.println("Product saved for Later successfully");
			}
			else
				System.out.println("Product not saved for later");
		}
		//Global.driver.quit();
}