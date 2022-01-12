package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPojo extends BaseClass {
	public BookHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	  @FindBy(id="first_name")
      private WebElement txtfristname;
      @FindBy(id="last_name")
      private WebElement txtlastname;
      @FindBy(id="address")
      private WebElement txtaddress;
      @FindBy(id="cc_num")
      private WebElement txtcardnum;
      @FindBy(id="cc_type")
      private WebElement cardtype;
      @FindBy(id="cc_exp_month")
      private WebElement expmonth;
      @FindBy(id="cc_exp_year")
      private WebElement expyear;
      @FindBy(id="cc_cvv")
      private WebElement entercvv;
      @FindBy(id="book_now")
      private WebElement btnbooknow;
      @FindBy(id="cancel")
      private WebElement btncancel;
	public WebElement getTxtfristname() {
		return txtfristname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getTxtaddress() {
		return txtaddress;
	}
	public WebElement getTxtcardnum() {
		return txtcardnum;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getEntercvv() {
		return entercvv;
	}
	public WebElement getBtnbooknow() {
		return btnbooknow;
	}
	public WebElement getBtncancel() {
		return btncancel;
	}
}
