package com.definition;

import com.base.BaseClass;
import com.pojo.AdactinLoginPojo;
import com.pojo.BookHotelPojo;
import com.pojo.BookingConfirmPojo;
import com.pojo.SearchHotelPojo;
import com.pojo.SelectHotelPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	@Given("User launch Adactin  Web Application")
	public void user_launch_Adactin_Web_Application() {
		
	    loadUrl("https://adactinhotelapp.com/");
	}

	@Then("User verify Adactin Hotel Login page is displayed")
	public void user_verify_Adactin_Hotel_Login_page_is_displayed() {
	    String currentUrl = currentUrl();
	    boolean url = currentUrl.contains("adactinhotelapp");
	    System.out.println(url);
	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
		AdactinLoginPojo log = new AdactinLoginPojo();
		setText(log.getTxtusername(), "Gowthamkage123");
		setText(log.getTxtpass(), "kage123@");	
	}
	@When("User clicks Login Button")
	public void user_clicks_Login_Button() {
		AdactinLoginPojo log = new AdactinLoginPojo();
		btnClick(log.getBtnlogin());
	}

	@Then("User verify  Search Hotel page is displayed")
	public void user_verify_Search_Hotel_page_is_displayed() {
		 String currentUrl = currentUrl();
		    boolean url = currentUrl.contains("SearchHotel");
		    System.out.println(url);
	}

	@When("User select valid Location,Hotels,Room Type,Number of Rooms,Adults per Room,Child per Room")
	public void user_select_valid_Location_Hotels_Room_Type_Number_of_Rooms_Adults_per_Room_Child_per_Room() {
		SearchHotelPojo select = new SearchHotelPojo();
		selectByIndex(select.getSelectloc(), 1);
		selectByIndex(select.getSelecthotels(), 2);
		selectByIndex(select.getSelectroom(), 2);
		selectByIndex(select.getRoomnos(), 2);
		selectByIndex(select.getAdultroom(), 3);
		selectByIndex(select.getChildroom(), 1);
	}
  
	@When("User clicks Search Button")
	public void user_clicks_Search_Button() {
		SearchHotelPojo search = new SearchHotelPojo();
		btnClick(search.getBtnsearch());
	}

	@Then("User verify Select Hotel page")
	public void user_verify_Select_Hotel_page() {
	    String currentUrl = currentUrl();
	    boolean url = currentUrl.contains("SelectHotel");
	    System.out.println(url);
	}

	@When("User clicks Radio Button and User clicks Continue Button")
	public void user_clicks_Radio_Button_and_User_clicks_Continue_Button() {
		SelectHotelPojo select = new SelectHotelPojo();
		btnClick(select.getBtnradio());
		btnClick(select.getBtncontinue());
	}

	@Then("User verify Booking page")
	public void user_verify_Booking_page() {
		String currentUrl = currentUrl();
	    boolean url = currentUrl.contains("BookHotel");
	    System.out.println(url);
	}

	@When("User enters Frist Name, Last Name,Billing Address")
	public void user_enters_Frist_Name_Last_Name_Billing_Address() {
		BookHotelPojo book = new BookHotelPojo();
		setText(book.getTxtfristname(), "gowtham");
		setText(book.getTxtlastname(), "Anbu");
		setText(book.getTxtaddress(), "345 Asohknagar,\n,chennai45");
	}

	@When("User enters Credit Card No and Select Credit Card Type,Expiry Month,Year and Cvv Number")
	public void user_enters_Credit_Card_No_and_Select_Credit_Card_Type_Expiry_Month_Year_and_Cvv_Number() {
		BookHotelPojo book = new BookHotelPojo();
		setText(book.getTxtcardnum(), "9791255869456123");
		selectByVisibleText(book.getCardtype(), "American Express");
		selectByVisibleText(book.getExpmonth(), "April");
		selectByVisibleText(book.getExpyear(), "2022");
		setText(book.getEntercvv(), "456");
	}

	@When("User Clicks Book Now Button")
	public void user_Clicks_Book_Now_Button() {
		BookHotelPojo book = new BookHotelPojo();
		btnClick(book.getBtnbooknow());
	}

	@Then("User Verify Order No is displayed")
	public void user_Verify_Order_No_is_displayed() throws InterruptedException {
		Thread.sleep(5000);
		BookingConfirmPojo conf = new BookingConfirmPojo();
		String attribute =getAttribute(conf.getOrderno());
		System.out.println(attribute);
	}
	@When("User enters valid {string} and valid {string}")
	public void user_enters_valid_and_valid(String string, String string2) {
		AdactinLoginPojo log = new AdactinLoginPojo();
		setText(log.getTxtusername(), string);
		setText(log.getTxtpass(), string2);	
	}

	@When("User select valid {string},{string},{string},{string},{string},{string}")
	public void user_select_valid(String string, String string2, String string3, String string4, String string5, String string6) {
		SearchHotelPojo select = new SearchHotelPojo();
		selectByVisibleText(select.getSelectloc(), string);
		selectByVisibleText(select.getSelecthotels(), string2);
		selectByVisibleText(select.getSelectroom(), string3);
		selectByVisibleText(select.getRoomnos(), string4);
		selectByVisibleText(select.getAdultroom(), string5);
		selectByVisibleText(select.getChildroom(), string6);
	}

	@When("User enters {string}, {string},{string}")
	public void user_enters(String string, String string2, String string3) {
		BookHotelPojo book = new BookHotelPojo();
		setText(book.getTxtfristname(), string);
		setText(book.getTxtlastname(), string2);
		setText(book.getTxtaddress(), string3);
	}

	@When("User enters {string} and Select {string},{string},{string} and {string}")
	public void user_enters_and_Select_and(String string, String string2, String string3, String string4, String string5) {
		BookHotelPojo book = new BookHotelPojo();
		setText(book.getTxtcardnum(), string);
		selectByVisibleText(book.getCardtype(), string2);
		selectByVisibleText(book.getExpmonth(), string3);
		selectByVisibleText(book.getExpyear(), string4);
		setText(book.getEntercvv(), string5);
	}

}

