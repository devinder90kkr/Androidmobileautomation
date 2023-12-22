package cuesz01.Iosapp_member_homeScreen;

import java.util.HashMap;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify Live perform icon when event time min 15 min")


public class Case10_Homescreen_LPwith15min extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check LP redirection to perform card on homescreen.")
    @Story("here, we need to verify LP icon functionality redirection to perform screen if counter equal or less than 15 min")	
	
	public void HomescreenLiveperfrom() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		   // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "LP icon");
				
        Thread.sleep(3500);
		WebElement livePerform = driver.findElement(mobileLocators.liveperfrmicon);
		livePerform.click();
		
		  // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform selection");
        
     // Method to scroll to perform screen
     		HashMap<String,Object>scrollObject =new HashMap<>();
     		scrollObject.put("direction", "down");
     		scrollObject.put("Start Live Perform", "Start Live Perform");
     		driver.executeScript("mobile:scroll", scrollObject);
     		  // Capture a screenshot and attach it to Allure
     
//        
//     // Scroll to "Start Live Perform" without specifying the time
//        By imaguploadLocator = AppiumBy.iOSNsPredicateString("label BEGINSWITH 'Start Live Perform'");
//        if (!isElementPresent(driver, imaguploadLocator)) {
//            // Scroll to "Start Live Perform" if it's not present
//            HashMap<String, Object> scrollObject = new HashMap<>();
//            scrollObject.put("predicateString", "label BEGINSWITH 'Start Live Perform'");
//            driver.executeScript("mobile:scroll", scrollObject);
//            Thread.sleep(2000);
     //   }   		
            AllureUtils.captureScreenshot(driver, "perform selection1");
	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	}
	
	

}
