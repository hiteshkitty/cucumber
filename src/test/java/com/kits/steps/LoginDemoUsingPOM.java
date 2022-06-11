package com.kits.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.kits.util.AbstractChromeWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoUsingPOM extends AbstractChromeWebDriver {

	private LoginPage loginPage;
	
	@Given("broswer is open by user")
	public void broswer_is_open_by_user() {
		beforeTest();
	}

	@Given("user opens login page")
	public void user_opens_login_page() {
		
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
	}

	@When("enter (.*) and (.*)$")
	public void user_enter_credentials(String userName, String password) {
		loginPage = new LoginPage(driver);
		loginPage.loginValidUser(userName, password);
		sleep(2);
		
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginBtn();
		sleep(2);
	}

	@Then("user is navigated to home")
	public void user_is_navigated_to_home() {
		loginPage.verifyLogout();
		afterTest();
	}

}
