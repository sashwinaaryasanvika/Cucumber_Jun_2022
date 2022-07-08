package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	private void credenTials() {
		String expected="Anu";
		String actual="Anu";
		Assert.assertEquals(actual, expected);

	}
	
	
	@Test
	private void loginDetails() {
		String expected="Priya";
		String actual="Arun";
		Assert.assertEquals(actual, expected);
		

	}
	
	

}
