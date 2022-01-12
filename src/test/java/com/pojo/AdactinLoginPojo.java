package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AdactinLoginPojo extends BaseClass{
	public AdactinLoginPojo() {
	PageFactory.initElements(driver, this);
	}

    @FindBy(id="username")
private WebElement txtusername;

    @FindBy(id="password")
private WebElement txtpass;

    @FindBy(id="login")
private WebElement btnlogin;
    
    @FindBy(xpath="//a[text()='New User Register Here'])")
private WebElement clickRegister;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getClickRegister() {
		return clickRegister;
	}

}
