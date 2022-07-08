package com.automationpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass_june.BaseClass_June;
import com.pojoclass.LoginPage;
import com.pojoclass.SearchHotel_Page;

public class AdactineProject extends BaseClass_June{
	
	public static void main(String[] args) {
		
		driver=getBrowser("chrome");
		
		getUrl("https://adactinhotelapp.com/");
		
		PageObjectManager pom=new PageObjectManager(driver);
		
		//LoginPage lp=new LoginPage(driver);
		
		inputText(pom.getInstanceLp().getUsername(), "arvind19");
		inputText(pom.getInstanceLp().getPassword(), "12345678");
		clickButton(pom.getInstanceLp().getSubmit());

		dropDown(pom.getinstanceSearch().getLoc(), "byIndex", "1");

		
		
		
		
		//close();


		
		
	}



}
