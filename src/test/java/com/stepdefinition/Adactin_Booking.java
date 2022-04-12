package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.Maven_final.Base_Class;
import com.Maven_final.Pom_Class;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Adactin_Booking extends Base_Class {
	
	public static WebDriver driver=Base_Class.browser_Launch();
	
	@Given("adactin hotel website loginpage should be open")
	public void adactin_hotel_website_loginpage_should_be_open() {
		
		url("https://adactinhotelapp.com/");
	   
	}
	
	@When("user should enter valid username")
	public void user_should_enter_valid_username() {
		PageFactory.initElements(driver, Pom_Class.class);
		sendkeys(Pom_Class.username,"selviharish");
		
	    	}

	@When("user should enter valid password")
	public void user_should_enter_valid_password() {
	    sendkeys(Pom_Class.password, "vihaan1234");
	}

	@Then("aferclicking login button navigate to homepage")
	public void aferclicking_login_button_navigate_to_homepage() {
		click(Pom_Class.login);
	   }

	@Given("select location from dropdown")
	public void select_location_from_dropdown() {
		dropdown(Pom_Class.location, "value", "Melbourne");
	}
	   
	

	@When("select your room you want from dropdown")
	public void select_your_room_you_want_from_dropdown() {
		dropdown(Pom_Class.hotel, "text", "Hotel Cornice");
	    	}

	@Then("select roomtype from dropdown")
	public void select_roomtype_from_dropdown() {
		dropdown(Pom_Class.room, "index", "2");
	    	}

	@Then("select number of rooms in your dropdown")
	public void select_number_of_rooms_in_your_dropdown() {
		dropdown(Pom_Class.num1, "text", "4 - Four");
    
	}

	@Then("select checkin date with valid format")
	public void select_checkin_date_with_valid_format() {
		clear(Pom_Class.checkin);
		sendkeys(Pom_Class.checkin, "17/04/2022");
	   	}

	@Then("select checkoutdate from dropdown")
	public void select_checkoutdate_from_dropdown() {
		clear(Pom_Class.checkout);
		sendkeys(Pom_Class.checkout, "20/04/2022");
	   
	}

	@Then("select number of adult in one room")
	public void select_number_of_adult_in_one_room() {
		dropdown(Pom_Class.adult, "value", "3");
	   	}

	@Then("selct number of children count it is not mandatory")
	public void selct_number_of_children_count_it_is_not_mandatory() {
		dropdown(Pom_Class.child, "text", "1 - One");
	    
	}

	@Then("click search button")
	public void click_search_button() {
		click(Pom_Class.search);
	   	}

	
	

}


	