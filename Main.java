package com.vinay.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\myfiles\\Lakehead Studies\\my\\resources\\testing\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        
        driver.quit();

	}
}
