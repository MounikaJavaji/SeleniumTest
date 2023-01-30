package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JMOUNI\\eclipse-workspace\\SeleniumTest\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		

		String str = driver.getTitle();

		System.out.println(str);

		driver.manage().window().maximize();

		WebDriverWait wait= new WebDriverWait(driver,10);

		try

		{

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Login']"))));

		System.out.println("Login button clickable");

		}

		catch(Exception e)

		{

		System.out.println("Login button not clickable");

		}

		WebDriverWait wait1 = new WebDriverWait(driver, 5);

		try

		{

		wait1.until(ExpectedConditions.textToBe(By.xpath("//h1[text()='Find your dream job now']"),"Find your dream job w"));

		System.out.println("Page Loaded");

		}

		catch(Exception E)

		{

		System.out.println("Page not Loaded");

		}

		 

		}

		 

		

	}


