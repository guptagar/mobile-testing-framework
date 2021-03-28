package appiumtests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class whatsApp {
	
	@Test
	public void testwhatsApp() throws MalformedURLException
	{
		AndroidDriver driver;
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName","OnePlus 5");
		capability.setCapability("platform","Andriod");
		capability.setCapability("platformVersion","8.1.0"); 
		File file= new File("/Users/gayankgupta/eclipse-workspace/appiumtests/src/test/resources/appapk/WhatsApp.apk");
		capability.setCapability("app", file.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capability);
	}
	
	

}
