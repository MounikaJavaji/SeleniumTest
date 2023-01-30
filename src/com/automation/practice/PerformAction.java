package com.automation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class PerformAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JMOUNI\\eclipse-workspace\\SeleniumTest\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		PerformAction act=new PerformAction (); 
			
 
		WebElement src_element=driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement target_element=driver.findElement(By.xpath("//p[text()='Drop here']"));
		act.dragAndDrop(src_element, target_element).perform();
		WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		act.contextClick(element).perform();
		//double click
		WebElement element1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(element1).perform();
		
		//Move to Element
		WebElement element11=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));

		 

		act.moveToElement(element11).perform();
		
	}

	private Action moveToElement(WebElement element11) {
		// TODO Auto-generated method stub
		return null;
	}

	private Action doubleClick(WebElement element1) {
		// TODO Auto-generated method stub
		return null;
	}

	private Action contextClick(WebElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	private Action dragAndDrop(WebElement src_element, WebElement target_element) {
		// TODO Auto-generated method stub
		return null;
	}

}
