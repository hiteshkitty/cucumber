package com.kits.steps.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

	private WebDriver driver; 
	@FindBy(id = "name")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement loginButton;

	public LoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String usrName) {
		userName.sendKeys(usrName);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickLoginBtn() {
		loginButton.click();
	}


}
