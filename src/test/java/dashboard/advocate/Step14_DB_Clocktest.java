package dashboard.advocate;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.dashboard.Step14_DB_Clock;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.AllureUtils;
import cuesz.utils.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Advocate dashboard cases")
@Feature ("Vaerify Clock feature for dashbaord.")

public class Step14_DB_Clocktest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Step14_DB_Clock dashboardPage;

    private ByteArrayOutputStream consoleOutput; // To capture console output
    
    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        dashboardPage = new Step14_DB_Clock(driver);
        
        // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream);
    }

    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Advocate dashboard clock")
    @Story("Verify clock feature for staff portal.")
    
    public void advocateScheduleEventTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        dashboardPage.Clock();
    
        // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Logic page link", dynamicLink);
    
        // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
        
    }
    
 private String generateDynamicLink() {
        
        return "https://pre-staging.app.cuesz.com/dashboard"; // Replace with your actual dynamic link
    }
    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
       
    }
}


