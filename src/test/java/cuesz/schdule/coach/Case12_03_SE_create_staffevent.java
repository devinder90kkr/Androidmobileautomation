package cuesz.schdule.coach;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cuesz.logintest.CoachLogin;
import cuesz.schdule.Step12_03_SE_create_staffevent;
import cuesz.utils.WebDriverManager;

public class Case12_03_SE_create_staffevent {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Step12_03_SE_create_staffevent scheduleEventPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        scheduleEventPage = new Step12_03_SE_create_staffevent(driver);
    }

    @Test
     public void advocateScheduleEventTest() throws InterruptedException {
        CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        scheduleEventPage.Schdulevent();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
