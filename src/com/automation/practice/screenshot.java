package com.automation.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\JMOUNI\\eclipse-workspace\\SeleniumTest\\src\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/ ");
driver.manage().window().maximize();
Thread.sleep(5000);
TakesScreenshot t=(TakesScreenshot)driver;
File src=t.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\JMOUNI\\Pictures\\mouni.png");
FileUtils.copyFile(src,dest);

	}

}
