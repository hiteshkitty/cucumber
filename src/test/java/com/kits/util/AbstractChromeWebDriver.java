package com.kits.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriver {

  protected WebDriver driver;

  public AbstractChromeWebDriver() {
    super();
  }

  public void beforeTest() {
    //Download the web driver executable
    WebDriverManager.chromedriver().setup();
    
    //Create a instance of your web driver - chrome
    driver = new ChromeDriver();
  }

  public void afterTest() {
    driver.quit();
  }
  
  public void sleep(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}