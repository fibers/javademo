package com.fibers.demo.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class TestMain {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "x4-iphone7");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/fibers/works/myapp/build/ios/iphoneos/Runner.app");

        capabilities.setCapability(MobileCapabilityType.UDID, "e70235fff1811e4a79e3672457006b5b1e2e9cd3");
        capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.fibers.flutter.myapp");

        capabilities.setCapability("useNewWDA", true);



        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        System.out.println(driver.getPageSource());
    }


    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testGetTitle() {
        System.out.println("ahahaa");
    }

}
