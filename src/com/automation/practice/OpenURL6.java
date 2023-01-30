package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenURL6 {

	public static void main1(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JMOUNI\\eclipse-workspace\\SeleniumTest\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		String str = driver.getTitle();
		System.out.println(str);
        driver.manage().window().maximize();
        WebDriverWait wait= new WebDriverWait(driver,10);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        String str1 = driver.getTitle();

        System.out.println(str1);

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(5000);

         

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebDriverWait wait1 = new WebDriverWait(driver,10);

         

        try {

        wait1.until(ExpectedConditions.titleContains("OrangeHRM"));

        System.out.println("Page Loaded");

        }catch(Exception E) {

        System.out.println("Page Not Loaded");

        }

         

        try {

        wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']"))));

        System.out.println("Page Loaded");

        }catch(Exception E) {

        System.out.println("Page Not Loaded");

        }

        try {

        wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']"))));

        System.out.println("Page Loaded");

        }
        catch(Exception e) {

        	System.out.println("Page Loaded");

        }

        public static void main(String[] args)  {

        String exepath = "";

        System.setProperty("webdriver.chrome.driver", exepath);

        WebDriver driver;

        WebDriver driver2 = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

         try {

        Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Login']"))));

        System.out.println("Page Loaded");

        }catch(Exception E) {

        System.out.println("Page Not Loaded");

        }

        try {

        Wait.until(ExpectedConditions.textToBe(By.xpath("//p[text()='Forgot your password? ']"),"Forgot your password?"));

        System.out.println("Page Loaded");

        }catch(Exception E) {

        System.out.println("Page Not Loaded");

        }

         

         

        
        
        
	}
}		