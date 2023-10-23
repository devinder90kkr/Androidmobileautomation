package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Perform detail")
@Feature ("Verify Additional perform activity functionlaity")


public class Case12_Perform_additionalactivity_deleteprocess extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By performclick	= AppiumBy.accessibilityId("PERFORM_SCREEN");
	private By perfomplus	=	 AppiumBy.accessibilityId("AddEvent");
	private By additionalperform	= AppiumBy.accessibilityId("Start My Perform Activity");
	private By cross_additionalpopup 	= AppiumBy.accessibilityId("CrossClicked");
//	private By searcharea			= AppiumBy.accessibilityId("EnterActivityName");
	private By doneclick			= AppiumBy.accessibilityId("Done");
	private By selectactivity		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Baseball \"])[3]");
	private By deletebaseball		= AppiumBy.accessibilityId("Baseball DeleteIcon");
	private By nodelete 			= AppiumBy.accessibilityId("No");
	private By yesdelete 			= AppiumBy.accessibilityId("Yes");
	private By backclick			= AppiumBy.accessibilityId("BackPress");
	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity with delete process.")
    @Story("here, we need to verify member able to delete additional perform activity functionality")	
	
	public void perfom_additionaldeleteactivty() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
			
		// CLick on Perform card
		WebElement performcard = driver.findElement(performclick);
		performcard.click();
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click1");
		
		WebElement perfomplusicon 	= driver.findElement(perfomplus);
		perfomplusicon.click();
		
		WebElement startmyperformactivity 	= driver.findElement(additionalperform);
		startmyperformactivity.click();
		
		WebElement startmyperfromactivitycross 	= driver.findElement(cross_additionalpopup);
		startmyperfromactivitycross.click();
		
		// repeat steps again 
		WebElement perfomplusicon1 	= driver.findElement(perfomplus);
		perfomplusicon1.click();
		
		WebElement startmyperformactivity2 	= driver.findElement(additionalperform);
		startmyperformactivity2.click();
		
//		// Enter text for Search field 
//		WebElement Additonalperformsearch	= driver.findElement(searcharea);
//		Additonalperformsearch.sendKeys("Baseball");
	
		// Enter text for Search field 
		WebElement Additonalperformsearch1	= driver.findElement(AppiumBy.iOSClassChain("label == \"B\""));
		Additonalperformsearch1.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch2	= driver.findElement(AppiumBy.iOSClassChain("label == \"a\""));
		Additonalperformsearch2.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch3	= driver.findElement(AppiumBy.iOSClassChain("label == \"s\""));
		Additonalperformsearch3.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch4	= driver.findElement(AppiumBy.iOSClassChain("label == \"e\""));
		Additonalperformsearch4.click();
		

		// Enter text for Search field 
		WebElement Additonalperformsearch5	= driver.findElement(AppiumBy.iOSClassChain("label == \"b\""));
		Additonalperformsearch5.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch6	= driver.findElement(AppiumBy.iOSClassChain("label == \"a\""));
		Additonalperformsearch6.click();
		
		// Enter text for Search field 
		WebElement Additonalperformsearch7	= driver.findElement(AppiumBy.iOSClassChain("label == \"l\""));
		Additonalperformsearch7.click();
		
		// Enter text for Search field 
		WebElement Additonalperformsearch8	= driver.findElement(AppiumBy.iOSClassChain("label == \"l\""));
		Additonalperformsearch8.click();
		
		
		// Enter text for Search field 
		WebElement donekeypad	= driver.findElement(doneclick);
		donekeypad.click();
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click2");
		
		
		// Select perform aditonal activity 
		WebElement selectbaseball 	= driver.findElement(selectactivity);
		selectbaseball.click();
		
		WebElement backactivity 	= driver.findElement(backclick);
		backactivity.click();
		
		
		WebElement deleteaddiotnal	= driver.findElement(deletebaseball);
		deleteaddiotnal.click();
		
		WebElement nodeleteoption	= driver.findElement(nodelete);
		nodeleteoption.click();
		
		WebElement deleteaddiotnal1	= driver.findElement(deletebaseball);
		deleteaddiotnal1.click();
		
		WebElement yesdeleteoption	= driver.findElement(yesdelete);
		yesdeleteoption.click();
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click3");
		
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
