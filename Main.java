package com.vinay.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        
        WebElement input = driver.findElement(By.xpath("//*[@id=\"my-text-id\"]"));
        WebElement password = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input"));
      
        if (input != null) {
        	input.sendKeys("abc");
        }
        if (password != null) {
        	password.sendKeys("pqr");
        }
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
        driver.quit();

        
	}
}
