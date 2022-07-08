package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
	
	@Parameters({"username", "password"})
	@Test
	private void loginDetails(@Optional("root") String Uname, @Optional("root123") String Pass) {
		System.out.println("Username: " +Uname);
		System.out.println("Password: " +Pass);

	}
	

}
