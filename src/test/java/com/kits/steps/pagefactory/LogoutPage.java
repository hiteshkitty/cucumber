package com.kits.steps.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	private WebDriver driver;

	private By logout = By.id("logout");

	public LogoutPage(WebDriver webDriver) {
		this.driver = webDriver;
	}

	public void logout() {
		driver.findElement(logout).click();
	}

	public void verifyLogout() {
		driver.findElement(logout).isDisplayed();
	}
}
