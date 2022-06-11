package com.kits.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.kits.util.AbstractChromeWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleDemo extends AbstractChromeWebDriver {

	@Given("browser is open")
	public void browser_is_open() {
		beforeTest();
	}

	@Given("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("Go to google page");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@When("user enters text in search bar")
	public void user_enters_text_in_search_bar() {
		System.out.println("enter text in search bar");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java");
		sleep(1);
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		System.out.println("clicks on search button");
		WebElement element = driver.findElement(By.name("btnK"));
		element.click();
	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
		System.out.println("verify serach result page is displayed..");
		sleep(3);
		driver.quit();
	}

}
