package cuesz01.Iosapp_member_homeScreen;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify spheres separtors detail for Perform, Fuel, Mindful & Restore.")


public class Case05_Homescreen_arrows extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By backarrowbttn = 		AppiumBy.accessibilityId("HomeBackArrow");
	private By forwardarrowbttn = AppiumBy.accessibilityId("HomeForwardArrow");
	
	 private ByteArrayOutputStream consoleOutput; // To capture console output
	   
		@BeforeClass
		 public void setUp() {
		      
		 // Redirect console output to capture it
		 consoleOutput = new ByteArrayOutputStream();
		 PrintStream printStream = new PrintStream(consoleOutput);
		 System.setOut(printStream);
		        
		  }

	@Test

	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check spheres separtors.")
    @Story("Click on spheres and verify bounces spehere activity.")	
	
	public void Homescreensperators() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();

		scrollDown();
		
		// Click on HomeBackArrow button 4 times
	    for (int i = 0; i < 4; i++) {
	        WebElement backarrow = driver.findElement(backarrowbttn);
	        backarrow.click();
	        Thread.sleep(1000); // Optional delay to observe the action
	        
	    }

	    // Click on HomeForwardArrow button 5 times
	    for (int i = 0; i < 5; i++) {
	        WebElement forwardarrow = driver.findElement(forwardarrowbttn );
	        forwardarrow.click();
	        Thread.sleep(1000); // Optional delay to observe the action
	    }

	    // Click on HomeBackArrow button 1 more time
	    WebElement backarrow = driver.findElement(backarrowbttn);
	    backarrow.click();
	    Thread.sleep(1000); // Optional delay to observe the action
		
         	
	}
	

//Function to scroll down using the provided scroll method
private void scrollDown() {
	// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Current 7 days", "Current 7 days");
		driver.executeScript("mobile:scroll", scrollObject);
}
}
