package com.testng;

import org.testng.annotations.Test;

public class GroupingPgm {
	
	@Test(groups = "Sports")
	private void chessGame() {
		System.out.println("Chess");

	}
	
	@Test(groups = "Sports")
	private void carromGame() {
		System.out.println("Carrom");

	}
	
	@Test(groups = "Social")
	private void faceBook() {
		System.out.println("FB");

	}
	
	
	@Test(groups = "Social")
	private void instaGram() {
		System.out.println("Insta");

	}
	
	
	@Test(groups = "Social")
	private void twitTer() {
		System.out.println("Twitter");

	}
	
	
	@Test(groups = "Sports")
	private void cricKet() {
		System.out.println("Cricket");

	}
	
	
	@Test(groups = "Courses")
	private void seleniumCourse() {
		System.out.println("Selenium");

	}
	
	
	@Test(groups = "Courses")
	private void cucumBer() {
		System.out.println("Cucumber");

	}
	
	
	
	
	
	

}
