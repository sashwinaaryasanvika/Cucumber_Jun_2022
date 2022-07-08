package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
	//STCM
	
	
	@BeforeSuite
	private void browserLaunch() {
		System.out.println("Browser Launch - Set Property");

	}
	
	@BeforeTest
	private void webDriver() {
		System.out.println("WebDriver");

	}
	
	
	@BeforeClass
	private void getUrl() {
		System.out.println("www.amazon.com");

	}
	
	@BeforeMethod
	private void loginUrl() {
		System.out.println("Login");

	}
	
	@Test(priority = -1)
	private void mobileSearch() {
		
		System.out.println("Mobile");

	}
	
	@Ignore
	@Test(invocationCount = 3)
	private void laptopSearch() {
		
		System.out.println("Laptop");

	}
	
	@Test(enabled = false)
	private void acSearch() {
		System.out.println("AC");

	}
	
	
	@AfterMethod
	private void logOut() {
		System.out.println("LogOut");

	}
	
	@AfterClass
	private void homePage() {
		System.out.println("HomePage");

	}
	
	@AfterTest
	private void closeBrowser() {
		System.out.println("Close");

	}
	
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete All Cookies");

	}
	
	
	

}
