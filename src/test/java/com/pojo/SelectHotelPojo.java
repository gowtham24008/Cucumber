package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPojo extends BaseClass {
	public SelectHotelPojo() {
		PageFactory.initElements(driver, this);
	}

    @FindBy(id="radiobutton_0")
    private WebElement btnradio;
    @FindBy(id="continue")
    private WebElement btncontinue;
    @FindBy(id="cancel")
    private WebElement btncancel;
	public WebElement getBtnradio() {
		return btnradio;
	}
	public WebElement getBtncontinue() {
		return btncontinue;
	}
	public WebElement getBtncancel() {
		return btncancel;
	}
}
