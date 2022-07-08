package com.testng;

import org.testng.annotations.Test;

public class TimeOutException {
	
	@Test(timeOut = 2000)
	private void credenTials() throws InterruptedException {
				
		System.out.println("Username");
		Thread.sleep(5000);
		System.out.println("Password");

	}
	
	

}
