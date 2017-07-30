package tld.domain.my_mobile_tests;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.testproject.java.enums.ExecutionResultType;
import io.testproject.java.sdk.generated.codeblocks.Test;

public class MyFirstMobileTest extends Test {

	@Override
	protected ExecutionResultType execute() throws Exception {
		// TODO Auto-generated method stub
		
		// Get driver initialized by TestProject Agent
		AndroidDriver<MobileElement> driver = this.getAndroidDriver(MobileElement.class);
		
		// Find First name element and type 'John'
		MobileElement firstName = driver.findElement(By.id("firstName")); firstName.sendKeys("John");
		
		// Find Last name element and type 'Smith'
		MobileElement lastName = driver.findElement(By.id("lastName")); lastName.sendKeys("Smith");
		
		return null;
	}

}
