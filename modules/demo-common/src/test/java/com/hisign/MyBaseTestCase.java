package com.hisign;

import org.mockito.MockitoAnnotations;

import junit.framework.TestCase;

public abstract class MyBaseTestCase extends TestCase {

	public void setUp() {
		MockitoAnnotations.initMocks(this); 
	}
	
//	public void testAs() {
//		
//	}
}
