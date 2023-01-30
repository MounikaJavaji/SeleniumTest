package com.automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class basepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\JMOUNI\\\\eclipse-workspace\\\\SeleniumTest\\\\src\\\\driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 @FindBy(xpath="//input[@name='username']")private WebElement textUsername;
		@FindBy(xpath="//input[@name='password']")private WebElement textPassword; 
		@FindBy(xpath="//button[@type='submit']")private WebElement btnClick; 
		@FindBy(xpath="//span[text()='Admin']")private WebElement AdminClick;,
		
		public BasePage(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);
		}
		public void enterUsername( String str ) {
			textUsername.sendKeys(str);
				
		} 
		public void enterPassword(String str) {
			textPassword.sendKeys(str);
		}
		public void clickLogin() {
			btnClick.click();
		}

	}

}
