package com.williams.sonoma.test.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.williams.sonoma.test.common.Global;
import junit.framework.Assert;
/**
 * This class is responsible to store Web elements on Home page and and operations performed on it which we have used in our entire framework.
 */
public class HomeSection {
	public HomeSection(){
		String homepageIdentifier = "Cookware, Cooking Utensils, Kitchen Decor & Gourmet Foods | Williams Sonoma";
		try {
			if (Global.driver.getTitle().contains(homepageIdentifier)) {
					PageFactory.initElements(Global.driver, this);
					System.out.println("You are on Home Section");
				}
				else {
					System.out.println("you are not on Home Section, Sorry i can't continue...");
					Assert.fail("Home page is not loaded..");
				}
			} catch (Exception e) {
		}
	}
	@FindBy(xpath="//a[@class='topnav-cookware '][contains(@href, 'cookware')]")
	public WebElement cookWareLnk;

	@FindBy(xpath="//a[contains(@href, 'international-cookware')]//following::a[1]")
	public WebElement teaKettleLnk;

	/**
	 * Method moveToCookWareLnk is responsible for moving cursor on CookWare link and to display all products under CookWare.
	 */
	public void moveToCookWareLnk() throws InterruptedException{
		PageFactory.initElements(Global.driver, this);
		Actions act = new Actions(Global.driver);
		act.moveToElement(cookWareLnk).perform();
		Thread.sleep(3000);
	}
	/**
	 * Method viewTeaKettlePage is responsible for selecting product and view the product details
	 * @return TeaKettlesSection
	 */
	public TeaKettlesSection viewTeaKettleSection(){
		PageFactory.initElements(Global.driver, this);
		Actions act = new Actions(Global.driver);
		act.moveToElement(teaKettleLnk);
		this.teaKettleLnk.click();
		return new TeaKettlesSection();
	}
}