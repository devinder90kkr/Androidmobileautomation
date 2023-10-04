package cuesz.utils;
import io.appium.java_client.AppiumDriver;
import java.util.HashMap;
import java.util.Map;

public class AppiumappUtils {
    private AppiumDriver driver;

    public AppiumappUtils(AppiumDriver driver) {
        this.driver = driver;
    }

    public void launchAppWithPackageId(String packageId) {
//        Map<String, String> params = new HashMap<>();
//        params.put("bundleId", packageId);
//        driver.executeScript("mobile:launchApp", params);
        
        
        Map<String,String> params =new  HashMap<String,String>();
        //package name =	"package_name": "com.cuesz.mobile"
		params.put("bundleId", "com.cuesz.mobile");
		driver.executeScript("mobile:launchApp", params);
    }
}
