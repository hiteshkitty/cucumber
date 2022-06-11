package com.kits.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	private By userName = By.id("name");
	private By password = By.id("password");
	private By loginButton = By.id("login");
	private By logout = By.id("logout");
	
	public LoginPage(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	public void enterUserName(String usrName) {
		driver.findElement(userName).sendKeys(usrName);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginButton).click();
	}
	
	public void loginValidUser(String name, String pwd) {
		driver.findElement(userName).sendKeys(name);
		driver.findElement(password).sendKeys(pwd);
//		driver.findElement(loginButton).click();
	}
	
	public void verifyLogout() {
		driver.findElement(logout).isDisplayed();
	}
}
