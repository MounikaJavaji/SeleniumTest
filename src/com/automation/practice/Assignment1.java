package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\JMOUNI\\\\eclipse-workspace\\\\SeleniumTest\\\\src\\\\driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@href='/register'])")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mounika");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("J");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("javajimounika54@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("an@123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("an@123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		

	}

}
