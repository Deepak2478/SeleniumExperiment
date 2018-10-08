package com.deep.tester.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage {
	
	private WebDriver driver;
	
	public GoogleResultPage(WebDriver driver) throws InterruptedException{
		this.driver = driver;
		Thread.sleep(10000);
	}
	
	public String getFirstResultText(){
		WebElement firsResult = driver.findElement(By.xpath("//a[@href='http://www.seleniumhq.org/']"));
		String resultText = firsResult.getText();
		return resultText;
	}
}
