package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumwebDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method st
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\JMOUNI\\\\eclipse-workspace\\\\SeleniumTest\\\\src\\\\driver\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.selenium.dev/downloads/");

driver.findElement(By.xpath("(//a[contains(text(),'4')])[7]")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("(//a[text()='API Docs'])[5]")).click();
	}

}
