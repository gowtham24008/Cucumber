package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPojo extends BaseClass{
	public SearchHotelPojo() {
		PageFactory.initElements(driver, this);
	}

	  @FindBy(id="location")
    private WebElement selectloc;
    @FindBy(id="hotels")
    private WebElement selecthotels;
    @FindBy(id="room_type")
    private WebElement selectroom;
    @FindBy(id="room_nos")
    private WebElement roomnos;
    @FindBy(id="datepick_in")
    private WebElement selectdatein;
    @FindBy(id="datepick_out")
    private WebElement selectdateout;
    @FindBy(id="adult_room")
    private WebElement adultroom;
    @FindBy(id="child_room")
    private WebElement childroom;
    @FindBy(id="Submit")
    private WebElement btnsearch;
    @FindBy(id="Reset")
    private WebElement btnreset;
	public WebElement getSelectloc() {
		return selectloc;
	}
	public WebElement getSelecthotels() {
		return selecthotels;
	}
	public WebElement getSelectroom() {
		return selectroom;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getSelectdatein() {
		return selectdatein;
	}
	public WebElement getSelectdateout() {
		return selectdateout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getBtnsearch() {
		return btnsearch;
	}
	public WebElement getBtnreset() {
		return btnreset;
	}
}
