package cuesz.pages;
//
////import java.io.File;
//import java.time.Duration;
//
////import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import java.net.MalformedURLException;
//import java.net.URL;
//
////import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.ios.options.XCUITestOptions;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
////import io.appium.java_client.service.local.AppiumServiceBuilder;
//
//
//
//public class AppiummobileBase {
//	
//	public IOSDriver driver;
//	public AppiumDriverLocalService service;
//
//
//	@BeforeClass
//	public void Cueszbase() throws MalformedURLException {
//		
////		service = new AppiumServiceBuilder().withAppiumJS(new File ("/usr/local/lib/node_modules/appium/build/lib/main.js"))
////				.withIPAddress("127.0.0.1").usingPort(4723).build();
////		service.start();
//		
//		XCUITestOptions options = new XCUITestOptions();
//		
//		options.setDeviceName("iPhone 11"); 
//		//options.setApp("/Users/chicmic/Library/Developer/Xcode/DerivedData/Cuesz-hdxdkjshiithbzbsbrpmxverlvva/Build/Products/Release-iphonesimulator/Cuesz.app");
//		options.setPlatformVersion("17.0");
//
//		//Appium- webdriver Agent ---->IOS Apps.
//		options.setWdaLaunchTimeout(Duration.ofSeconds(30));
//					
//		driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			
//	}	
//	
//	@AfterClass
//    public void tearDown() {
//        driver.quit();
//
////        // Stop the service
//        if (service != null) {
//            service.stop();
//        }
//    }
//}

import java.net.MalformedURLException;
import java.time.Duration;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.URL;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Epic("Home screen detail ")
@Feature("Verify individual spheres detail for Perform, Fuel, Mindful & Restore.")
public class AppiummobileBase {

    public IOSDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void Cueszbase() throws MalformedURLException {

        XCUITestOptions options = new XCUITestOptions();
        
//   //      simulator details
//        options.setDeviceName("iPhone 11");
//        options.setPlatformVersion("17.0");


     //     for real device
        options.setPlatformName("iOS");
        options.setDeviceName("Iphone13");
        options.setPlatformVersion("17.4.1");
        options.setAutomationName("XCUITest");
        options.setUdid("00008110-00142D610A79801E");
        options.setWdaLaunchTimeout(Duration.ofSeconds(30));

        
//        //     for real device
//        options.setPlatformName("iOS");
//        options.setDeviceName("iPhone 13 pro");
//        options.setPlatformVersion("17.4.1");
//        options.setAutomationName("XCUITest");
//        options.setUdid("00008110-000E58443E9A801E");
//        options.setWdaLaunchTimeout(Duration.ofSeconds(30));

        
        
        
        
//        //     for real device
//        options.setPlatformName("iOS");
//        options.setDeviceName("ChicMic’s iPhone (2)");
//        options.setPlatformVersion("16.6.1");
//        options.setAutomationName("XCUITest");
//        options.setUdid("00008101-000A58221104001E");
//        options.setWdaLaunchTimeout(Duration.ofSeconds(30));

        
        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();

        if (service != null) {
            service.stop();
        }
    }
}
