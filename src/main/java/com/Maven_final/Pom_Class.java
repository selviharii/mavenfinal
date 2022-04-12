package com.Maven_final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_Class {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
    public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="login")
	public static WebElement login;
	
	//search hotel
	
	@FindBy(id="location")
	public static WebElement location;
	
	@FindBy(id="hotels")
	public static WebElement hotel;
	
	@FindBy(id="room_type")
	public static WebElement room;
	
	@FindBy(id="room_nos")
	public static WebElement num1;
	
    @FindBy(id="datepick_in")
    public static WebElement checkin;
	
	@FindBy(id="datepick_out")
	public static WebElement checkout;
	
	@FindBy(id="adult_room")
	public static WebElement adult;
	
	@FindBy(id="child_room")
	public static WebElement child;
	
	@FindBy(id="Submit")
	public static WebElement search;
	
	@FindBy(id="radiobutton_0")
	public static WebElement button;
	
	@FindBy(id="continue")
	public static WebElement con;
	
	//book now
	
	@FindBy(id="first_name")
	public static WebElement first;
	
	@FindBy(id="last_name")
	public static WebElement lastname;
	
	@FindBy(id="address")
	public static WebElement addr ;
	
	@FindBy(id="cc_num")
	public static WebElement num;
	
	@FindBy(id="cc_type")
	public static WebElement type;
	
	@FindBy(id="cc_exp_month")
	public static WebElement month;
	
	@FindBy(id="cc_exp_year")
	public static WebElement year;
	
	
	@FindBy(id="cc_cvv")
	public static WebElement ccv;
	
	@FindBy(id="book_now")
	public static WebElement book;
	
	//cancel
	@FindBy(xpath="(//input[@type='checkbox'])[18]")
	public static WebElement checkbox;
	
	@FindBy(name="cancelall")
	public static WebElement cancel;
	
	@FindBy(xpath="//a[text()='Logout']")
	public static WebElement logout;
	

}



