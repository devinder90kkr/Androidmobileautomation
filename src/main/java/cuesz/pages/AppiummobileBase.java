package cuesz.pages;

import java.io.File;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiummobileBase {
	
	public IOSDriver driver;
	public AppiumDriverLocalService service;


	@BeforeClass
	public void Cueszbase() throws MalformedURLException {
		
	//	service = new AppiumServiceBuilder().withAppiumJS(new File ("/usr/local/lib/node_modules/appium/build/lib/main.js"))
	//			.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		XCUITestOptions options = new XCUITestOptions();
		
		options.setDeviceName("iPhone 13"); 
	//	options.setApp("/Users/chicmic/Library/Developer/Xcode/DerivedData/Cuesz-bqpwimbqhasqchfcnbjnkdsbevuv/Build/Products/Release-iphonesimulator/Cuesz.app");
		options.setPlatformVersion("17.0");

		//Appium- webdriver Agent ---->IOS Apps.
		options.setWdaLaunchTimeout(Duration.ofSeconds(30));
		
		driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}	
	
	@AfterClass
    public void tearDown() {
        driver.quit();

        // Stop the service
        if (service != null) {
            service.stop();
        }
    }
}