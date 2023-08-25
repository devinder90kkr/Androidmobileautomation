package cuesz.logictest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logicpage.Case34_MSL_MemberBasicinfo;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case34_MSL_MemberBasicinfotest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case34_MSL_MemberBasicinfo memberlogicPage;

    private ExtentReports extent;
    private ExtentTest test;
    
    
    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case34_MSL_MemberBasicinfo(driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case34_MSL_MemberBasicinfo Test");
    }

    @Test
    public void advocatelogicmemberTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();	

        // Access the Schedule Event page
        memberlogicPage.Basicinfo();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
        
        // Log test steps and results
        test.log(Status.INFO, "Navigated to member Basic Info over Page");
        // Add more logs and assertions as needed
        
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
