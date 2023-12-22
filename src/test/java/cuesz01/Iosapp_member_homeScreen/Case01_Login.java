package cuesz01.Iosapp_member_homeScreen;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
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
@Epic ("Login detail Screen")
@Feature ("Verify functionlaity for Login screen")
public class Case01_Login extends AppiummobileBase {
	@BeforeClass
	 public void setUp() {
	  }
@Test
@Owner("QA") // Add the @Owner annotation to specify the executor
@Severity(SeverityLevel.NORMAL)      
@Description("Verify login functionlaity with OTP verification")
@Story("Click on mobile field and input values and than redirect to OTp screen & click on login button")	

	public void login() throws InterruptedException
	{
	// Create an instance of AppiumUtils and pass the driver
			AppiumappUtils appiumUtils = new AppiumappUtils(driver);
	        // Launch the app using the utility method
	        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
	
		WebElement countryvalues = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"🇮🇳\"])[2]"));
		countryvalues.click();
		
		WebElement countryname = driver.findElement(AppiumBy.accessibilityId("text-input-country-filter"));
		countryname.sendKeys("India");
		
		WebElement indiaselection = driver.findElement(AppiumBy.accessibilityId("country-selector-IN"));
		indiaselection.click();
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Country selection"); 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement mobilefield = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSNsPredicateString("name == \"SignInTextInput\"")));
		mobilefield.click();
		
//		driver.findElement(AppiumBy.iOSNsPredicateString("name == \"SignInTextInput\"")).sendKeys(" 9671114235");
		
		Thread.sleep(5000);
		WebElement mobfield1 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"9\"]"));
		mobfield1.click();
		
		WebElement mobfield2 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"6\"]"));
		mobfield2.click();
		
		WebElement mobfield3 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"7\"]"));
		mobfield3.click();	
		
		WebElement mobfield4 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"1\"]"));
		mobfield4.click();
		
		WebElement mobfield5 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"1\"]"));
		mobfield5.click();
		
		WebElement mobfield6 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"1\"]"));
		mobfield6.click();
		
		WebElement mobfield7 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"4\"]"));
		mobfield7.click();
		
		WebElement mobfield8 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"2\"]"));
		mobfield8.click();
		
		WebElement mobfield9 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"3\"]"));
		mobfield9.click();
		
		WebElement mobfield10 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"5\"]"));
		mobfield10.click();

		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Mobile number input before login tap"); 
		
		Thread.sleep(2000);
		WebElement Loginbutton	= driver.findElement(AppiumBy.accessibilityId("LoginButton"));
		Loginbutton.click();
	
		WebElement Otp1 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[1]"));
		Otp1.sendKeys("2");
		WebElement Otp2 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[2]"));
		Otp2.sendKeys("1");
		WebElement Otp3 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[3]"));
		Otp3.sendKeys("0");
		WebElement Otp4 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[4]"));
		Otp4.sendKeys("9");
		WebElement Otp5 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[5]"));
		Otp5.sendKeys("9");
		WebElement Otp6 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[6]"));
		Otp6.sendKeys("9");
		
		WebElement submitnbutton	= driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Submit\"])[3]"));
		submitnbutton.click();
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "landed on home screen");  
	
		Thread.sleep(3500);
		driver.terminateApp("com.cuesz.mobile");
	
		
	}
}

