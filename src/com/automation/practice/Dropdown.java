package com.automation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JMOUNI\\eclipse-workspace\\SeleniumTest\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JMOUNI/Documents/Select.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		System.out.println("str");

		System.out.println(driver.getCurrentUrl());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		 

		 

		WebElement dropdown=driver.findElement(By.xpath("//select[@id='slv']")); //create webelement object

		 

		Select sel=new Select(dropdown);

		sel.selectByIndex(1);

		Thread.sleep(5000);

		sel.selectByValue("j");

		 

		Thread.sleep(5000);

		sel.deselectAll();

	}

}
