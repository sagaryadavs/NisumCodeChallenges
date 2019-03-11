package com.williams.sonoma.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.williams.sonoma.test.common.Global;

import junit.framework.Assert;
/**
 * This class is responsible to store Web elements on Tea Kettles page and operations performed on it which we have used in our entire framework.
 */
public class TeaKettlesSection {
	public TeaKettlesSection(){
		String teaKettlesSectionIdentifier = "Tea Kettles, Electric Tea Kettles & Electric Kettles |";
		try {
			if (Global.driver.getTitle().contains(teaKettlesSectionIdentifier)) {
					PageFactory.initElements(Global.driver, this);
					System.out.println("You are on Tea Kettles Section ");
				}
				else {
					System.out.println("you are not on Tea Kettles Section , Sorry i can't continue...");
					Assert.fail("Tea Kettles Section page is not loaded..");
				}
		} catch (Exception e) {
		}
	}
	@FindBy(xpath="//a[@title='Minimize']")
	WebElement minimizeDBox;
	
	@FindBy(xpath="//a[@class='stickyHeaderCloseButton sticky-close-button']")
	WebElement minimizeFooterLink;
	
	@FindBy(xpath="//*[contains(text(),'Smeg Dolce & Gabbana Electric Kettle')]")
	public WebElement selectKettle;
	
	/**
	 * Method minimizeDialogBox is responsible closing the popup which displayed after moving to Tea Kettles Section.
	 */
	public void minimizeDialogBox() throws InterruptedException{
		PageFactory.initElements(Global.driver	, this);
		if(Global.driver.getPageSource().contains("email-campaign-form-wrapper-sticky"))
		{
		this.minimizeDBox.click();
		Thread.sleep(2000);
		this.minimizeFooterLink.click();
		Thread.sleep(2000);
		}
		else{
			System.out.println("Selecting the Product");
		}
	}
	/**
	 * Method viewKettleSection is responsible to show details about selected product.
	 * @return KettleDetailsSection
	 */
	public KettleDetailsSection viewKettleDetails(){
		PageFactory.initElements(Global.driver, this);
		this.selectKettle.click();
		System.out.println("Product selected Successfully");
		return new KettleDetailsSection();
	}
}