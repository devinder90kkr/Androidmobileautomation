package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@Epic ("Fuel upload screen functionlaity ")
@Feature ("Verify Upload detail functionlaity for lunch.")
public class Case35_Fuel_Lunch_uploadphoto extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case35_Fuel_Lunch_uploadphoto.class);
	
	private By Homeclick 				= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By uploadlunchimage		=		AppiumBy.accessibilityId("LunchUploadIcon");
	private By gallery					=		AppiumBy.accessibilityId("GalleryClicked");
	private By Time						= 		AppiumBy.accessibilityId("SelectTime");
	private By pickerelement			= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick				= 		AppiumBy.accessibilityId("AlcohalTime");
	private By submittap				= 		AppiumBy.accessibilityId("SubmitImage");
	private By arrowclick				= 		AppiumBy.accessibilityId("RightArrow");
	private By Icondelete				= 		AppiumBy.accessibilityId("DeletePhoto");


	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member check upload functionlaity verification")
    @Story("Scroll to Fuel card and upload image for lunch.")	
	public void Fuel_Lunch_uploadphoto() throws InterruptedException
	{	
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		// Log console message to Allure
 		LOGGER.info("Click on Homeicon");
 		AllureUtils.logStep("Click on Homeicon");
 		// Capture a screenshot and attach it to Allure
 		AllureUtils.captureScreenshot(driver, "Case35_1");
		 		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver, "Case35_2");
        
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Breakfast", "Breakfast");
		driver.executeScript("mobile:scroll", scrollObject1);
		Thread.sleep(2000);
		// Log console message to Allure
        LOGGER.info("Scroll to breakfast");
        AllureUtils.logStep("Scroll to breakfast");
		
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject2 =new HashMap<>();
		scrollObject2.put("direction", "down");
		scrollObject2.put("Early Snacks", "Early Snacks");
		driver.executeScript("mobile:scroll", scrollObject2);
		Thread.sleep(2000);
		// Log console message to Allure
        LOGGER.info("Scroll to early snack");
        AllureUtils.logStep("Scroll to early snacks");

		
//		Thread.sleep(3000);
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject21 =new HashMap<>();
//		scrollObject21.put("direction", "down");
//		scrollObject21.put("Lunch", "Lunch");
//		driver.executeScript("mobile:scroll", scrollObject21);
//		Thread.sleep(2000);
//		// Log console message to Allure
//        LOGGER.info("Scroll to Lunch");
//        AllureUtils.logStep("Scroll to Lunch");
        
        Thread.sleep(2500);
        WebElement uploadicon	= driver.findElement(uploadlunchimage);
        uploadicon.click();
        Thread.sleep(2500);
        // Log console message to Allure
        LOGGER.info("Click on uploadicon");
        AllureUtils.logStep("Click on uploadicon");
        AllureUtils.captureScreenshot(driver, "Case35_3");
        
        Thread.sleep(2500);
        WebElement galleryclick	= driver.findElement(gallery);
        galleryclick.click();
        // Log console message to Allure
        LOGGER.info("Click on galleryclick");
        AllureUtils.logStep("Click on galleryclick");
        AllureUtils.captureScreenshot(driver, "Case35_4");
        
        
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
        firstPhoto.click();
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
        // Log console message to Allure
        LOGGER.info("Click on addclick");
        AllureUtils.logStep("Click on addclick");
        AllureUtils.captureScreenshot(driver, "Case35_5");
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("8");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("13");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");   
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunchadd7");
        
		driver.findElement(Doneclick).click();
		// Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
        
		WebElement Submittap = driver.findElement(submittap);
		Submittap.click();
		// Log console message to Allure
        LOGGER.info("Click on Submittap");
        AllureUtils.logStep("Click on Submittap");
     
		
		Thread.sleep(4500);
		
		
		WebElement uploadicon1	= driver.findElement(uploadlunchimage);
	    uploadicon1.click();
	    // Log console message to Allure
        LOGGER.info("Click on uploadicon1");
        AllureUtils.logStep("Click on uploadicon1");
        AllureUtils.captureScreenshot(driver, "Case35_8");
	    
//	    WebElement photoicon	= driver.findElement(uploadphoto);
//	    photoicon.click();
        WebElement photclick	= driver.findElement(AppiumBy.accessibilityId("PhotoUpload"));
        photclick.click();
        
	   
	    WebElement galleryclick2	= driver.findElement(gallery);
        galleryclick2.click();
        // Log console message to Allure
        LOGGER.info("Click on galleryclick2");
        AllureUtils.logStep("Click on galleryclick2");
        AllureUtils.captureScreenshot(driver, "Case35_9");
	    
        WebElement firstPhoto2 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[3]"));
        firstPhoto2.click();
        
        WebElement addclick2 = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick2.click();
        
        
        // Click on timer 
        WebElement Timerclick2 	= driver.findElement(Time);
        Timerclick2.click();
        
        List<WebElement>values1 = driver.findElements(pickerelement);

		for (int i=0; i<values1.size();i++)
		{		
		System.out.println(values1.get(i).getText());
		}
		
		values1.get(0).sendKeys("1");
		values1.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values1.get(1).sendKeys("13");
		values1.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values1.get(2).sendKeys("PM");
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case35_10");

		driver.findElement(Doneclick).click();
        
		WebElement Submittap1 = driver.findElement(submittap);
		Submittap1.click();
		// Log console message to Allure
        LOGGER.info("Click on Submittap1");
        AllureUtils.logStep("Click on Submittap1");
        AllureUtils.captureScreenshot(driver, "Case35_11");
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunchadd8");
		
		Thread.sleep(4500);
	
		WebElement uploadicon2	= driver.findElement(uploadlunchimage);
	    uploadicon2.click();
	    // Log console message to Allure
        LOGGER.info("Click on uploadicon2");
        AllureUtils.logStep("Click on uploadicon2");
        AllureUtils.captureScreenshot(driver, "Case35_12");
          
        Thread.sleep(2500);
	    //locate and click on toggel arrow 
	    WebElement arrowright	= driver.findElement(arrowclick);
	    arrowright.click();
	    // Log console message to Allure
        LOGGER.info("Click on arrowright");
        AllureUtils.logStep("Click on arrowright");
        AllureUtils.captureScreenshot(driver, "Case35_13");
	    
	    
	 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunchadd9");
	    
	    //Locate and click on delete icon
	    WebElement deleticon	= driver.findElement(Icondelete);
	    deleticon.click();
	    // Log console message to Allure
        LOGGER.info("Click on deleticon");
        AllureUtils.logStep("Click on deleticon");
        AllureUtils.captureScreenshot(driver, "Case35_14");
	    Thread.sleep(4500);
	    
	    Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject11 =new HashMap<>();
		scrollObject11.put("direction", "down");
		scrollObject11.put("Image uploaded", "Perform");
		driver.executeScript("mobile:scroll", scrollObject11);
		Thread.sleep(2000);
	    
	    
        
		Thread.sleep(8500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	
