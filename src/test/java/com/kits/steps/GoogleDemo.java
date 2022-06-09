package com.kits.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleDemo {

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("open chrome");
	}

	@Given("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("Go to google page");
	}

	@When("user enters text in search bar")
	public void user_enters_text_in_search_bar() {
	   System.out.println("enter text in search bar");
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
	    System.out.println("clicks on search button");
	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
	    System.out.println("verify serach result page is displayed..");
	}

}

