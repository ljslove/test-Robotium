package com.example.testmanager;

import com.example.androidui.test.ButtonTest;
import com.example.androidui.test.DialogButtonTest;
import com.example.androidui.test.FirstTest;

import junit.framework.TestSuite;

public class ButtonTestSuite extends TestSuite {
	
	
	public static TestSuite getButtonSuite(){
		
		TestSuite suite=new TestSuite();
		suite.addTestSuite(ButtonTest.class);
		suite.addTestSuite(DialogButtonTest.class);
		suite.addTestSuite(FirstTest.class);
		
		return suite;
		
	}

}
