import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import junit.framework.Assert;

public class Ecommerce_TC01 extends BaseClass{

	//public static void main(String a[]) throws IOException {
//	@Test(priority = 2, enabled = false)
//	public void verifySubmitForm() throws IOException {
//		
//		AndroidDriver<AndroidElement> driver = capabilities();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
//		driver.findElement(By.xpath("//*[@text='Female']")).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
//		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");
//		scrollToTextAndClick(driver, "India");
//		//driver.findElement(By.xpath("//*[@text='India']")).click();
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		
//		//findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()). scrollIntoView(text("Enter your element"))");
//	}
//		
//	@Test(priority = 1, enabled = false)
//	public void verifyTostMessage() throws IOException {
//		AndroidDriver<AndroidElement> driver = capabilities();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//*[@text='Female']")).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
//		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");
//		scrollToTextAndClick(driver, "Egypt");
//		//driver.findElement(By.xpath("//*[@text='India']")).click();
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		
//		String toastErrorMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
//		
//		//System.out.println("Toast Message: "+toastErrorMessage);
//		Assert.assertEquals("Please enter your name", toastErrorMessage);
//	}
//	
//	@Test(priority = 3, enabled = false)
//	public void selectProductAndAddToCart() throws IOException {
//		
//		AndroidDriver<AndroidElement> driver = capabilities();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		String product1 = "Jordan 6 Rings";
//		String product2 = "LeBron Soldier 12";
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Manjunath");
//		driver.findElement(By.xpath("//*[@text='Female']")).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
//		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");
//		scrollToTextAndClick(driver, "Australia");
//		//driver.findElement(By.xpath("//*[@text='India']")).click();
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		scrollToProduct(driver,product1);
//		selectProductAdnAddToCart(driver,product1);
//		
//		//Verify the products in cart
//		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		String cartProduct = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
//		System.out.println(cartProduct);
//		Assert.assertEquals(cartProduct, product1);
//		
//
//	}
	
	@Test(priority = 4)
	public void selectProductsAndAddToCart() throws IOException, InterruptedException {
		
		String product1 = "PG 3";
		String product2 = "Jordan 6 Rings";
		
		String products = "PG 3:Air Jordan 4 Retro";
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Manjunath");
		driver.findElement(By.xpath("//*[@text='Male']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");
		scrollToTextAndClick(driver, "Cuba");
		//driver.findElement(By.xpath("//*[@text='India']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Selecting Two products
		//driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
//		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
		
		scrollToProductAndAddToCart(driver,products);
		
//		scrollToProduct(driver,product1);
//		selectProductAdnAddToCart(driver,product1);
//		
//		scrollToProduct(driver,product2);
//		selectProductAdnAddToCart(driver,product2);
		
		//Verify the total prices in cart
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		//Sum of two product 
		//double sum = amountValue1+amountValue2;
		double sum = getTotalPriceOfProducts();
		System.out.println("Sum of two products: "+sum);
		
		//Get the total value
		String totalAmount = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		totalAmount = totalAmount.substring(1);
		double totalAmountValue = Double.parseDouble(totalAmount);
		System.out.println("Total Amount of the products: "+totalAmountValue);
		
		Assert.assertEquals(sum, totalAmountValue);
		
		//driver.findElement(By.xpath("\\android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
		//Switch to Native to Web
		Thread.sleep(7000);
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		}
		driver.context((String) contextNames.toArray()[1]); //Switch to Web View
		//do some web testing
		
		
		Thread.sleep(2000);
		System.out.println("Web Title of the page: "+driver.getTitle());
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("appium Test");
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sasalu.manjunath@gmail.com");
		
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context((String) contextNames.toArray()[0]); //Switch to Native app view
	}
	
	public void scrollToProductAndAddToCart(AndroidDriver<AndroidElement> driver, String products) {
		
		System.out.println("Products String: "+products);
		String[] productList = products.split(":");
		
		for(int i=0;i<productList.length;i++) {
			System.out.println("Product Name: ++++++++ : "+productList[i]);
			scrollToProduct(driver,productList[i]);
			selectProductAdnAddToCart(driver,productList[i]);
		}
	}

	public static double getTotalPriceOfProducts() throws InterruptedException {
		
		//Thread.sleep(5000);
		int numberOfProducts= driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double sumOfProducts = 0.00;
		for(int i=0;i<numberOfProducts;i++) {
			String amount = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			//Remove dolor 
			amount = amount.substring(1);
			double amountValue1 = Double.parseDouble(amount);
			sumOfProducts+=amountValue1;
		}
		
		
		return sumOfProducts;
	}
	
	
	public static void selectProductAdnAddToCart(AndroidDriver<AndroidElement> driver, String product) {
		
		//Get the count of the products which is displayed on Panel and click on selected Product
		System.out.println("*********** Product:  "+product);
		int count =0;
		
		count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for(int i=0;i<count;i++) {
			String text = (driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText()).trim();
			System.out.println("Actual Product: "+text);
			if(text.equalsIgnoreCase(product)) {
				//click on Add to cart
				System.out.println("Product: "+product.trim());
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}
		}
		
	}

	public static void scrollToTextAndClick(AndroidDriver<AndroidElement> driver, String selector) {
			
			//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+selector+"\").instance(0))"));
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+selector+"\"));");
			driver.findElement(By.xpath("//*[@text='"+selector+"'"+"]")).click();
			
		}
	
	public static void scrollToProduct(AndroidDriver<AndroidElement> driver, String product) {
		driver.findElementByAndroidUIAutomator
		("new UiScrollable(new UiSelector()"+ ".resourceId(\"com.androidsample.generalstore:id/rvProductList\"))"
		+ ".scrollIntoView("+ "new UiSelector().text(\""+product+"\"));");
		
		
		
		
	}
}
