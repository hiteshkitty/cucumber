package com.kits.steps.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookDemoSteps {

	private WebDriver driver;
	
	@Before
	public void beforeTest() {
		// Download the web driver executable
		WebDriverManager.chromedriver().setup();

		// Create a instance of your web driver - chrome
		driver = new ChromeDriver();
	}

	@After
	public void afterTest() {
		driver.quit();
	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("before every step .. perform this");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("after every step .. perform this");
	}
	
	
	@Given("user opens login screen")
	public void user_opens_login_screen() {
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
	}

	@When("user enters name and password")
	public void user_enters_name_and_password() {
	}

	@When("user clicks login btn")
	public void user_clicks_login_btn() {
	}

	@Then("user navigated to home screen")
	public void user_navigated_to_home_screen() {
	}

}
