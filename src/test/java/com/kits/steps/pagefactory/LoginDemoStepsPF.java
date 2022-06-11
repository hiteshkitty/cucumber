package com.kits.steps.pagefactory;

import org.openqa.selenium.WebDriver;

import com.kits.util.AbstractChromeWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoStepsPF extends AbstractChromeWebDriver {

	private LoginPagePF loginPage = null;

	public LoginDemoStepsPF() {
		// TODO Auto-generated constructor stub
	}

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
		loginPage = new LoginPagePF(driver);
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		sleep(2);

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginBtn();
	}

	@Then("user is navigated to home")
	public void user_is_navigated_to_home() {
		afterTest();
	}

}
