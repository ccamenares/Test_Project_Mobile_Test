package tld.domain.my_mobile_tests;

import io.testproject.java.classes.DriverSettings;
import io.testproject.java.classes.MobileDriverSettings;
import io.testproject.java.enums.DriverType;
import io.testproject.java.sdk.generated.TestProjectRunner;

public class MyFirstMobileTest_Runner {
	
	// Setting the development token
	private final static String devToken = "YOUR_DEV_TOKEN_GOES_HERE";

	// Runs the test
	private static void runAddPersonCodeBlock() {
		DriverSettings driverSettings = getDriverSettings();

		try (TestProjectRunner runner =
			new TestProjectRunner(devToken, driverSettings, true)){
			// Creating an instance of the test
			MyFirstMobileTest myFirstMobileTest = new MyFirstMobileTest();
		
			// Running the test
			runner.run(myFirstMobileTest);
		} catch (Throwable e) {
		// Handle failure...
		}
	}

	
	// Initializes driver settings
	private static DriverSettings getDriverSettings() {
		DriverSettings driverSettings = new DriverSettings();
		
		// Declare that Android driver is required
		driverSettings.setDriverType(DriverType.Appium_Android);

		// Specify target device UDID and Name
		// This information is conveniently visible at https://app.testproject.io/#/agents
		// Under your connected agent on the devices tab
		driverSettings.setDeviceUdid("DEVICE_UDID");
		driverSettings.setDeviceName("DEVICE_NAME");

		// Specify mobile app settings
		MobileDriverSettings mobileSettings = new MobileDriverSettings();
		mobileSettings.setAndroidPackage("io.testproject.demo");
		mobileSettings.setAndroidActivity(".MainActivity");
		driverSettings.setMobileSettings(mobileSettings);

		return driverSettings;
	}

	
}
