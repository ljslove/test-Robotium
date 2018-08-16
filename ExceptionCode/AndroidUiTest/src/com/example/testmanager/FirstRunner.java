package com.example.testmanager;


import junit.framework.TestSuite;
import com.zutubi.android.junitreport.JUnitReportTestRunner;

public class FirstRunner extends JUnitReportTestRunner {
	
	@Override
	public TestSuite getAllTests(){
		
		TestSuite suite=new TestSuite();
		suite.addTest(ButtonTestSuite.getButtonSuite());
		suite.addTest(EditTestSuite.getEditTextSuite());
		
		return suite;
		
	}

}
