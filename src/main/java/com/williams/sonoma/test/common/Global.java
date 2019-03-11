package com.williams.sonoma.test.common;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.williams.sonoma.test.base.BaseClass;
import com.williams.sonoma.test.pages.HomeSection;
import com.williams.sonoma.test.pages.KettleDetailsSection;
import com.williams.sonoma.test.pages.SaveForLaterSection;
import com.williams.sonoma.test.pages.ShoppingCartSection;
import com.williams.sonoma.test.pages.TeaKettlesSection;
/**
 * This class is responsible to store objects of all classes and common variables which we have used in our entire framework.
 */
public class Global {
	public static WebDriver driver = null;
	public static WebDriverWait wait;
	public static WebElement element;
	public static List<WebElement> elements;
	public static BaseClass baseClass = new BaseClass();
	public static CONSTANT constant = new CONSTANT();
	public static Global global = new Global();
	public static CommonUtils commonUtils = new CommonUtils();
	public static HomeSection homeSection = new HomeSection();
	public static TeaKettlesSection teaKettleSection =new TeaKettlesSection();
	public static KettleDetailsSection kettleDetailsSection = new KettleDetailsSection();
	public static ShoppingCartSection shoppingCartSection = new ShoppingCartSection();
	public static SaveForLaterSection saveForLaterSection = new SaveForLaterSection();
}
