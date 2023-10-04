	package cuesz.logicpage;
	
	import java.text.ParseException;
	import java.time.Duration;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.Currentdategenerator;
import cuesz.utils.DatePickerUtility_logicpage;
import cuesz.utils.SeleniumUtils;
	
	public class Case45_MSL_restore_current extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
		private By Logicbttn =   (By.xpath("//span[normalize-space()='Logic Page']"));
		private By rstrhading = (By.xpath("(//div[normalize-space()='Restore'])[1]"));
		private By rsornotepls = (By.xpath("(//button[@data-bs-target='#Restore'])[1]"));
		private By slctbttn = (By.xpath("//div[@id='RestoreCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	
		private By rstropton1 =	(By.xpath("(//input[@placeholder='Enter Cue'])[1]"));
		private By rstropton2 =(By.xpath("(//input[@placeholder='Enter Cue'])[2]"));
		private By rstropton3 =(By.xpath("(//input[@placeholder='Enter Cue'])[3]"));
		private By SlephadngElement = (By.xpath("(//h6[contains(text(),'Sleep Time')])[2]"));
		private By Slepeopton =(By.xpath("(//input[@placeholder='Enter Cue'])[5]"));
		private By Slepeopton2 =(By.xpath("(//input[@placeholder='Enter Cue'])[5]"));

		
		
		private By slctbttn2 = (By.xpath("//div[@id='RestoreCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
		private By slctbttn3 = (By.xpath("//div[@id='RestoreCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	
		private By Copybttn = (By.xpath("(//button[@class='btn btn-sm btn-primary m-1'])[12]"));
		private By savebttn = (By.xpath("(//button[normalize-space()='Yes'])[1]"));
		

		
		public Case45_MSL_restore_current(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		 @Test
		    public void restore() throws InterruptedException, ParseException {
		        Thread.sleep(2000);
	
		        utils.clickMembersummary();
		        utils.waitForMilliseconds(2000);
		        utils.enterSearchText();
		        utils.clickMembername();
		  /***********************************landed on Logic page ***************************************************************************************************/
	   	
		       Thread.sleep(2000);
	   		   WebElement Logicbutton =   driver.findElement(Logicbttn);
	   		   Logicbutton.click();


	   		   
	   			   		   
	 /***************************************Click on restor and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement restorheading = driver.findElement(rstrhading);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", restorheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement restornoteplus = wait.until(ExpectedConditions.elementToBeClickable(rsornotepls));
			   restornoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(slctbttn);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);


     /********************************************************************Populate data for monday first activity *************************************************************************************/
			 					       
		      
			   Thread.sleep(2000);
			   WebElement restoreoption1 =driver.findElement(rstropton1);
			   Actions builder = new Actions(driver);
			   builder.moveToElement(restoreoption1).click().sendKeys("ice bath for 30 seconds").perform();
			   Thread.sleep(2000);
			  builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2000);
			   WebElement restoreoption2 =driver.findElement(rstropton2);
			   Actions builder2 = new Actions(driver);
			   builder2.moveToElement(restoreoption2).click().sendKeys("3x ZMA").perform();
			   Thread.sleep(2000);
			   builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2000);
			   WebElement restoreoption3 =driver.findElement(rstropton3);
			   Actions builder3 = new Actions(driver);
			   builder3.moveToElement(restoreoption3).click().sendKeys("This is manual enterny by automation tool").perform();
			   Thread.sleep(2000);
			   builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2500);
			   // Locate the heading element
		       WebElement SleepheadingElement = driver.findElement(SlephadngElement);
		       // Get the text of the heading
		       String actualHeading1 = SleepheadingElement.getText();
		       // Expected heading value
		       String expectedHeading1 = "Sleep Time";
		       // Perform the assertion
		       if (actualHeading1.equals(expectedHeading1)) {
		           System.out.println("Assertion Passed: Heading is 'Sleep Time'");
		       } else {
		           System.out.println("Assertion Failed: Heading is not 'Sleep Time'");
		       }
		       
		       
		       Thread.sleep(2000);
			   WebElement Sleepeoption =driver.findElement(Slepeopton);
			   Actions builder4 = new Actions(driver);
			   builder4.moveToElement(Sleepeoption).click().sendKeys("swedish relaxation").perform();
			   Thread.sleep(2000);
			   builder4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   Thread.sleep(2000);
		       
			   Thread.sleep(2000);
			   WebElement Sleepeoption2 =driver.findElement(Slepeopton2);
			   Actions builder5 = new Actions(driver);
			   builder5.moveToElement(Sleepeoption2).click().sendKeys("thinking on purpose").perform();
			   Thread.sleep(2000);
			   builder5.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   Thread.sleep(2000);

				   
			   /************************************ Select week and copy data******************************************************************/    
		        
		        Thread.sleep(5500);
				// Example usage:
				WebElement selectbutton11 = driver.findElement(slctbttn2);
			    // Scroll to the "Staff Notes" element using JavaScriptExecutor
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton11);
		        
		        
		        Thread.sleep(2500);
		        // Find and click on the "Select" button
			    WebElement selectButton = driver.findElement(slctbttn3);
			    selectButton.click();
			    
	/********* select date from calendar******/

			  // Call the utility method to select the desired date as per above scripts 
		        DatePickerUtility_logicpage.selectDesiredDate(driver);
		        
		        Thread.sleep(2500);
			    WebElement Copybutton = driver.findElement(Copybttn);
			    Copybutton.click();
		        Thread.sleep(2500);		
		        
		        // Locate an element within the pop-up
		        By popupElementLocator = By.xpath("//h3[contains(text(), 'Are you sure you want to copy the data for 1 weeks.')]");
		        WebElement popupElement = driver.findElement(popupElementLocator);

		        // Check if the pop-up element is displayed
		        if (popupElement.isDisplayed()) {
		            System.out.println("Pop-up is open.");
		        } else {
		            System.out.println("Pop-up is not open.");
		        }
		        Thread.sleep(500);
		     // Locate elements within the pop-up
		        By dataFromElementLocator = By.xpath("//span[contains(@class, 'date_field')]");
		        By dataToElementLocator = By.xpath("//ul[contains(@class, 'data_copy_list')]//span");

		        WebElement dataFromElement = driver.findElement(dataFromElementLocator);
		        WebElement dataToElement = driver.findElement(dataToElementLocator);

		        // Extract and print the values
		        String dataFromValue = dataFromElement.getText();
		        String dataToValue = dataToElement.getText();

		        System.out.println("Data to be copied from: " + dataFromValue);
		        System.out.println("Data will be copied to: " + dataToValue);
		        
		        
		        WebElement saveyesbutton = driver.findElement(savebttn);
		        saveyesbutton.click();
		        Thread.sleep(2500); 
		       
  
		 }
	}
	 
	
