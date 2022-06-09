package com.kits.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {


//	@Given("user calculated {int}\\/{int}")
//	public void user_calculated(Integer int1, Integer int2) {
//		int i = 1/0;
//		System.out.println(i);
//	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("we are on login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("enter user name and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("click on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("home page is seen");
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		System.out.println("enter invalid username and password");
	}

	@Then("error message is displayed - Invalid Credentials")
	public void error_message_is_displayed_Invalid_Credentials() {
		System.out.println("not able to login");
	}


}
