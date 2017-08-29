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

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class PostScore {
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
	  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	}
	@Test
	public void clickInit() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.playphone.msports.sdk.test:id/init")).click();
		Thread.sleep(32000);
		driver.findElement(By.id("spin-popup-skip")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Play Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.playphone.msports.sdk.test:id/start")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.playphone.msports.sdk.test:id/score")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Post Score']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='LOG IN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.view.View[@content-desc='Log in with Email']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("cooltestguy3076@hotmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Password']")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Password']")).sendKeys("test1234");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Log In']")).click();
		
		
		
		
		
		
		
	}
	}


