package cuesz.membersummarytest.advocate;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.Case91_MS_Reminderfeature;
import cuesz.utils.AllureUtils;
import cuesz.utils.WebDriverManager;

import io.qameta.allure.*;

@Epic ("Cuesz Staff on member Summary page for reminder feature")
@Feature ("Verify on member summary page staff able to add reminder for member with daily, weekly and monthly")

public class Case91_MS_Reminderfeaturetest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case91_MS_Reminderfeature membersummaryPage;
    private ByteArrayOutputStream consoleOutput; // To capture console output

    @BeforeClass
    public void setUp() {
    	// Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();
        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        membersummaryPage = new Case91_MS_Reminderfeature(driver);
        
     // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream); 
    }

    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)    
    @Description("Verify the reminder features.")
    @Story("Successfuly click on reminder button and input values for various recuuring methods.")
    
    public void actionsteps() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        membersummaryPage.reminder();
    
     // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Sleeptime", dynamicLink);
    
        // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "reminder");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
        
    }
    
 private String generateDynamicLink() {
        
        return "https://pre-staging.app.cuesz.com/member-specs/627d168e40231fb0ba6a057a"; // Replace with your actual dynamic link
    }
  
 private String getBrowserFromConfigFile() {
     Properties properties = new Properties();
     try (FileInputStream fis = new FileInputStream("config.properties")) {
         properties.load(fis);
     } catch (IOException e) {
         e.printStackTrace();
     }
     return properties.getProperty("browser", "chrome");
 }
 
 @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
       
    }
}