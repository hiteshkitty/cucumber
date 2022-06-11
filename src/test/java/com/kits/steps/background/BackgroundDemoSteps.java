package com.kits.steps.background;

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

public class BackgroundDemoSteps {

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

	
	
	@Given("raghav opens login screen")
	public void raghav_opens_login_screen() {
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
	}

	@When("raghav enters name and password")
	public void raghav_enters_name_and_password() {
	}

	@When("raghav clicks login btn")
	public void raghav_clicks_login_btn() {
	}

	@Then("raghav navigated to home screen")
	public void raghav_navigated_to_home_screen() {
	}

	@Given("raghav is on home screen")
	public void raghav_is_on_home_screen() {
	   System.out.println("raghav is on home ...");
	}

}
