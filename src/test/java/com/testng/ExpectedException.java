package com.testng;

import org.testng.annotations.Test;

public class ExpectedException {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void demoPgm() {
		
		int a=1/0;
		
		System.out.println(a);
		

	}

}
