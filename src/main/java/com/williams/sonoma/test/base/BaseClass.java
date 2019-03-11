package com.williams.sonoma.test.base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.williams.sonoma.test.common.Global;
/**
 * This class is responsible to store methods to start browser and close browser which we have used in our entire framework.
 * (Here I implemented only single browser but we can implement other browsers as per our requirements)
 */
public class BaseClass {
		@BeforeClass
		public void invokeBrowser(String browser) throws Exception{
			if (browser.equalsIgnoreCase("Chrome")) {
			Runtime.getRuntime().exec(System.getProperty("user.dir")+("\\Utilities\\ChromeKill.bat"));
			System.out.println("Browser Cleared");
				try {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Utilities\\chromedriver.exe"));
				Global.driver = new ChromeDriver();
				Global.driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				Global.driver.manage().window().maximize();
				Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("Exception occure during iniating chrome driver");
				}
			System.out.println("Browser started");
			}
		}
		@AfterClass
		public void closeBrowser(){
		Global.driver.quit();
		System.out.println("Browser closed");
		}
	}