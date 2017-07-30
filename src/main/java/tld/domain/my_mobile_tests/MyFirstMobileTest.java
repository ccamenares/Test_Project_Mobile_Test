package tld.domain.my_mobile_tests;

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
		
		return null;
	}

}
