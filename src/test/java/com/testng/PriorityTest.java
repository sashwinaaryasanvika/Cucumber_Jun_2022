package com.testng;

import org.testng.annotations.Test;

public class PriorityTest {
	
	
	@Test(priority = 0)
	private void credentialLogin() {
		System.out.println("Enter the valid credential");

	}
	
	@Test(invocationCount = 2)
	private void launchUrl() {
		System.out.println("Url");

	}
	
	
	@Test(priority = 1, invocationCount = 5)
	private void myProfile() {
		System.out.println("My Profile");

	}
	

}
