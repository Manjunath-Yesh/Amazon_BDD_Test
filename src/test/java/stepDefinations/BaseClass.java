package stepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObjects.LoginAndSearchPage;


public class BaseClass {
	

		public AppiumDriver<WebElement> driver = null;
		public LoginAndSearchPage lp = null;
		
		public static Logger logger;
		public Properties configPropObj;
		public static String apkPath = System.getProperty("user.dir")+ "\\apk\\Amazon_shopping.apk";
		
		
				
		
	}


