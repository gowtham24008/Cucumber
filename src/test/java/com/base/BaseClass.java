package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
  public static WebDriver driver;
  public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
  public void loadUrl(String url) {
		driver.get(url);
	}
  public void maximizeWindow() {
		driver.manage().window().maximize();
	}
    public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
    public void setText(WebElement element,String data) {
		element.sendKeys(data);
	}
    public void btnClick(WebElement element) {
		element.click();
	}
    public void selectByVisibleText(WebElement element,String data) {
	Select s = new Select(element);
	s.selectByVisibleText(data);
	}
    public void selectByIndex(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
    public void quitbrowser() {
		driver.quit();
	}
    public String getAttribute(WebElement e) {
    	String attribute = e.getAttribute("value");
    	return attribute;
}
}
