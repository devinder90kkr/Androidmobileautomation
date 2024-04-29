package cuesz02.Iosapp_member_home_PerformScreen;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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


public class Case17_Perform_LivePerformcurrent extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case17_Perform_LivePerformcurrent.class);

	
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
		
		 // Log console message to Allure
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        
		
		   // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "LP icon");
		
		
        Thread.sleep(3500);
		WebElement livePerform = driver.findElement(mobileLocators.liveperfrmicon);
		livePerform.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on livePerform ");
        AllureUtils.logStep("Click on livePerform");
		
		  // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform selection");
        
        WebElement StartLP	= driver.findElement(mobileLocators.liveperform);
        StartLP.click();
     // Log console message to Allure
        LOGGER.info("Click on StartLP ");
        AllureUtils.logStep("Click on StartLP");
        
//        this is incomplete script for LP 

        
        Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
