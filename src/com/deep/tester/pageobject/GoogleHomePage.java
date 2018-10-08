package com.deep.tester.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class GoogleHomePage {
	

	@FindBy(id="")
	private WebElement element;
	public void performSearch(String str)
	{
		//WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys(str);
		element.sendKeys(Keys.ENTER);
		
	}
}
