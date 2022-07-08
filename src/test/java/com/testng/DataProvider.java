package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	
	@org.testng.annotations.DataProvider
	private Object[][] loginData() {
		return new Object[][]{
					 {"root","root123"},
					 {"admin","admin123"},
					 {"sa","sa123"}
		};

	}
		

	@Test(dataProvider = "loginData")
	private void automationShop(String Uname, String pass) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  +"\\Driver\\chromedriver_new.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(Uname);
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys(pass);
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.close();
	}

}
