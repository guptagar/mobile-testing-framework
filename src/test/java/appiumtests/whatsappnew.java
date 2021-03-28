package appiumtests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class whatsappnew {
	
	public AndroidDriver driver;
	public String ContactName = "Nikky";
	@Test
	public void testwhatsApp() throws MalformedURLException
	{
		AndroidDriver driver;
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName","OnePlus 5");
		capability.setCapability("platform","Andriod");
		capability.setCapability("platformVersion","8.1.0"); 
		capability.setCapability("appPackage","com.whatsapp");
		capability.setCapability("appActivity","com.whatsapp.HomeActivity");
		File file= new File("/Users/gayankgupta/eclipse-workspace/appiumtests/appapk/WhatsApp.apk");
		capability.setCapability("noReset","true");
		capability.setCapability("app", file.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.findElement(By.id("com.whatsapp:id/menuitem_search")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search…']")).sendKeys(ContactName);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@index='0']")).click();
		driver.findElement(By.id("com.whatsapp:id/entry")).click();
		driver.findElement(By.id("com.whatsapp:id/emoji_picker_btn")).click();
		driver.findElement(By.id("com.whatsapp:id/emoji_picker_btn")).click();
		driver.findElement(By.id("com.whatsapp:id/thumb")).click();
		driver.findElement(By.id("com.whatsapp:id/gif")).click();
		driver.findElement(By.id("com.whatsapp:id/thumb_view")).click();
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.quit();
		
		}

}
