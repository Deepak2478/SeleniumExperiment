package com.deep.tester.pageobject.testcase;

import org.testng.annotations.Test;

import com.deep.tester.pageobject.GoogleHomePage;
import com.deep.tester.pageobject.GoogleResultPage;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
  private WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  PageFactory.initElements(driver, GoogleHomePage.class);
	  GoogleHomePage googleHomePage = new GoogleHomePage();
	  googleHomePage.performSearch("selenium");
	  
	  GoogleResultPage resultPage = new GoogleResultPage(driver);
	  String result = resultPage.getFirstResultText();
	  Assert.assertEquals(result, "Selenium - Web Browser Automation");
	  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	  jsExecutor.executeScript("", "");
  }
  @BeforeMethod
  public void beforeMethod() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/I323802/Downloads/chromedriver_win32/chromedriver.exe");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("proxy.pal.sap.corp:8080");
		proxy.setSslProxy("");
		capabilities.setCapability("proxy", proxy);	
		driver = new ChromeDriver(capabilities);
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
