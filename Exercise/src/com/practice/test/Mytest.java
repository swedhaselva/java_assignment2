package com.practice.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.practice.Myclass;

public class Mytest {

	@Test
	public void testpalin() {
	Myclass	test=new Myclass ();
	int res =test.palin(1221);
	assertEquals(1221,res);
		
	}


}




	 
    
    