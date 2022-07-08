package com.automationpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojoclass.LoginPage;
import com.pojoclass.SearchHotel_Page;

public class PageObjectManager {
	
	public static WebDriver driver; //Null Driver
	
	private LoginPage lp;
	private SearchHotel_Page search;


	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);	
	}


	public LoginPage getInstanceLp() {
		
		lp=new LoginPage(driver);
		return lp;
		
	}
	
	
	public SearchHotel_Page getinstanceSearch() {
		search=new SearchHotel_Page(driver);
		return search;
	}
	
	
	
	
	
	

}
