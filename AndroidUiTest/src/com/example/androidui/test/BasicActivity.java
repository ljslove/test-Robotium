package com.example.androidui.test;

import com.example.androidui.FirstActivity;
import com.example.pagewrap.PageHelper;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class BasicActivity extends ActivityInstrumentationTestCase2<FirstActivity> {
	
	protected Solo solo;
	public PageHelper helper;
	
	public BasicActivity(){
		super(FirstActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
		solo=new Solo(getInstrumentation(),getActivity());
		helper=new PageHelper(solo);
	}
	
	@Override
	protected void tearDown() throws Exception{
		solo.finishOpenedActivities();
		super.tearDown();
	}
	

}
