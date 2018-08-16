package com.example.testmanager;

import com.example.androidui.test.TestEditText;

import junit.framework.TestSuite;

public class EditTestSuite extends TestSuite {
	
	public static TestSuite getEditTextSuite(){
		
		TestSuite suite=new TestSuite();
		suite.addTestSuite(TestEditText.class);
		return suite;
	}

}
