package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmPojo extends BaseClass{
	public BookingConfirmPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
    private WebElement orderno;
    @FindBy(id="search_hotel")
    private WebElement btnsearchhotel;
    @FindBy(id="my_itinerary")
    private WebElement btniternerary;
    @FindBy(id="logout")
    private WebElement btnlogout;
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getBtnsearchhotel() {
		return btnsearchhotel;
	}
	public WebElement getBtniternerary() {
		return btniternerary;
	}
	public WebElement getBtnlogout() {
		return btnlogout;
	}

}
