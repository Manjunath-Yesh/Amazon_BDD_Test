$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/AmzonSeachFunctionality.feature");
formatter.feature({
  "name": "Search and Buy an Item",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User Launch Amazon Mobile App and select on \"Already a customer? Sign in\" Already a customer? Sign in Option",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enter the Email as \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"Continue\" Continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User Enter Password as \"\u003cpassword\u003e\" and clicks on \"Sign In\" Sign In Button",
  "keyword": "And "
});
formatter.step({
  "name": "User is Landed to Amazon Home page",
  "keyword": "And "
});
formatter.step({
  "name": "User Entered the search as \"\u003csearch_item\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should select the Items Randomly",
  "keyword": "Then "
});
formatter.step({
  "name": "User should able to buy the selected Item \"\u003cSearchIndex\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "search_item",
        "SearchIndex"
      ]
    },
    {
      "cells": [
        "manjunathqa21@gmail.com",
        "$ER$4er4",
        "samsung mobile phones",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Amazon Mobile App and select on \"Already a customer? Sign in\" Already a customer? Sign in Option",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Amazon_Mobile_App_and_select_on_Already_a_customer_Sign_in_Option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter the Email as \"manjunathqa21@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Enter_the_Email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"Continue\" Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_Continue_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Password as \"$ER$4er4\" and clicks on \"Sign In\" Sign In Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Enter_Password_as_and_clicks_on_Sign_In_Button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is Landed to Amazon Home page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_is_Landed_to_Amazon_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Entered the search as \"samsung mobile phones\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Entered_the_search_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the Items Randomly",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_select_the_Items_Randomly()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-APRU6N4\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: io.appium.java_client.AppiumDriver\nCapabilities {app: C:\\Users\\Manjunath\\OneDrive..., appPackage: com.amazon.mShop.android.sh..., databaseEnabled: false, desired: {app: C:\\Users\\Manjunath\\OneDrive..., platformName: android}, deviceApiLevel: 30, deviceManufacturer: Google, deviceModel: sdk_gphone_x86, deviceName: emulator-5554, deviceScreenDensity: 420, deviceScreenSize: 1080x1920, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 2.625, platform: LINUX, platformName: Android, platformVersion: 11, statBarHeight: 63, takesScreenshot: true, viewportRect: {height: 1731, left: 0, top: 63, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: edd8ce1e-edcc-44b9-8da7-d8fa01eb6b4b\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.TextView[contains(@text,\u0027samsung mobile phones\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:61)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:151)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat pageObjects.LoginAndSearchPage.randomlySelectSearchItem(LoginAndSearchPage.java:123)\r\n\tat stepDefinations.Steps.user_should_select_the_Items_Randomly(Steps.java:79)\r\n\tat ✽.User should select the Items Randomly(file:Features/AmzonSeachFunctionality.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should able to buy the selected Item \"3\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_should_able_to_buy_the_selected_Item(String)"
});
formatter.result({
  "status": "skipped"
});
});