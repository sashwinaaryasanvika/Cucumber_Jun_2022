package com.testng;

import org.testng.annotations.Test;

public class DependsOnMethods {
	

	
	
	@Test(dependsOnMethods = "diwaliOffer")
	private void mobileOffer() {
		System.out.println("Mobile Offer - 50%");

	}
	
	@Test
	private void laptopOffer() {
		System.out.println("Laptop Offer");

	}
	

}
