package com.automation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JMOUNI\\eclipse-workspace\\SeleniumTest\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VSRISHIT\\eclipse-workspace\\Sel+JAVA\\src\\driver\\chromedriver.exe" );
		WebDriver driver1=new ChromeDriver();
		BasePage page=new BasePage(driver1);
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		page.enterUsername("Admin");
		page.enterPassword("admin123");
		page.clickLogin();

	}

}
