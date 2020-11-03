import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	public static AndroidDriver<AndroidElement> driver;
	
	public static String apkPath = System.getProperty("user.dir")+ "\\apk\\General-Store.apk";
	public static Properties configPropObj;
	
	
	
	public static AndroidDriver<AndroidElement> capabilities() throws IOException{
		
		configPropObj = new Properties();
		FileInputStream configfile = new FileInputStream(System.getProperty("user.dir") + "\\Configuration\\config.properties");
		configPropObj.load(configfile);
		
		DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, configPropObj.getProperty("PLATFORM_NAME")); 
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, configPropObj.getProperty("DEVICE_NAME"));
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, configPropObj.getProperty("AUTOMATION_NAME"));
        dc.setCapability(MobileCapabilityType.APP, apkPath);
        URL url =new URL(configPropObj.getProperty("URL"));
        driver=new AndroidDriver<AndroidElement>(url, dc);
		
		return driver;
	}

}
