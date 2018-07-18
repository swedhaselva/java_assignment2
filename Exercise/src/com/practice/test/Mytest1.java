package com.practice.test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.practice.Myclass;



public class Mytest1{

	private static Myclass obj;
	
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		obj= new Myclass();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		obj= null;

	}



	@Test
	public void testPalin() {
		assertEquals("testPalin(),checking for reverse and palindrome"
				,1,obj.palin(1221));
	}
	@Test
	public void testPower() {
		assertEquals("testPower(),checking for reverse and palindrome"
				,1,obj.power(64));
	}
		
		
	
	}


