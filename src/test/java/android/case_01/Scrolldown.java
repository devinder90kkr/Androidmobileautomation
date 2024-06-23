package android.case_01;

import org.testng.annotations.Test;

import android.pages.AppiummobileBase;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Scrolldown extends AppiummobileBase  {

@Test
@Owner("QA")
@Severity(SeverityLevel.NORMAL)
@Description("Case descriptions")
@Story("Hre need to add user story for app")
public void Case1() throws InterruptedException {
	
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
	


}
}