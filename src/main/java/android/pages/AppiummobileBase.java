package android.pages;
import java.time.Duration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiummobileBase {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass
	public void configureAppium() throws MalformedURLException {
		
		// Ensure the correct path to Appium is used
				File appiumJS = new File("C:\\Users\\ASUS\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
				service = new AppiumServiceBuilder()
						.withAppiumJS(appiumJS)
						.withIPAddress("127.0.0.1")
						.usingPort(4723)
						.withTimeout(Duration.ofMinutes(1))  // Increase the timeout
						.build();
				service.start();
				
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setDeviceName("samsung SM-F127G"); 
		options.setPlatformName("Android");
		options.setPlatformVersion("13");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZ8R3234E0Z");
		options.setApp("C:\\Users\\ASUS\\OneDrive\\Documents\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}	
	
	@AfterClass
    public void tearDown() {
        driver.quit();

//        // Stop the service
        if (service != null) {
            service.stop();
        }
    }
}
