package com.williams.sonoma.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.williams.sonoma.test.common.Global;

import junit.framework.Assert;
/**
 * This class is responsible to store Web elements on Product Details page and operations performed on it which we have used in our entire framework.
 */
public class KettleDetailsSection {
	
	public KettleDetailsSection(){

		try {
			if (Global.driver.getTitle().contains(Global.teaKettleSection.selectKettle.getText())) {
					PageFactory.initElements(Global.driver, this);
					System.out.println("You are on Kettle Details Section");
				}
				else {
					//Log message Error 
					System.out.println("you are not on Kettle Details Section, Sorry i can't continue...");
					Assert.fail("Kettle Details Section not loaded..");
				}
		} catch (Exception e) {
			
		}
	}
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id='anchor-btn-checkout']")	
	WebElement checkOutBtn;
	
	@FindBy (xpath ="//img[contains(@alt,'Smeg Dolce & Gabbana Electric Kettle')]")
	WebElement selectedKettle;
	
	/**
	 * Method addToCart is responsible to add the selected product to the cart.
	 */
	public void addToCart(){
			PageFactory.initElements(Global.driver, this);
			this.addToCartBtn.click();	
	}
	/**
	 * Method checkOut is responsible to checkout for the product added in our cart.
	 * @return ShoppingCartSection
	 */
	@Test(dependsOnMethods = {"addToCart"})
	public ShoppingCartSection checkOut(){
		PageFactory.initElements(Global.driver, this);
		this.checkOutBtn.click();
		return new ShoppingCartSection();
	}
}
