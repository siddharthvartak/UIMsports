package com.playphone.nativeAndroid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Clickinit {
WebDriver driver;
	
	
	@BeforeClass
	public void setup()	throws MalformedURLException {
	  File f=new File("src");
	  File fs=new File(f,"SdkTest-debug.apk");
	  DesiredCapabilities caps=new DesiredCapabilities();
	  caps.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "56c34fc8");
	  caps.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	  caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	  driver = new RemoteWebDriver(new URL("http://172.16.1.180:4723/wd/hub"),caps);
	}
	@Test
	public void clickInit() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.playphone.msports.sdk.test:id/init")).click();

}
}