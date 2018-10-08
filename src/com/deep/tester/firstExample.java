package com.deep.tester;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstExample {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/I323802/Downloads/chromedriver_win32/chromedriver.exe");
		
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("proxy.pal.sap.corp:8080");
		proxy.setSslProxy("");
		capabilities.setCapability("proxy", proxy);	
		WebDriver driver = new ChromeDriver(capabilities);*/
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("test")));
		
		driver.get("http://www.google.co.in");
		
		WebElement inputBox = driver.findElement(By.id("lst-ib"));
		inputBox.sendKeys("selenium");
		inputBox.sendKeys(Keys.ENTER);
		
		Thread.sleep(10000);
		
		//WebElement firstResult = driver.findElement(By.cssSelector("div.rc")).findElement(By.xpath("h3/a"));
		//System.out.println(firstResult.getText());
		
		driver.quit();
	}

}
