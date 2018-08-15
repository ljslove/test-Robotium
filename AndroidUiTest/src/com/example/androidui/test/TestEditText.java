package com.example.androidui.test;



public class TestEditText extends BasicActivity{
	
	public TestEditText(){
		super();
	}
	
	public void testEditText(){
		
		helper.getPageFirst().inputEditText();
		assertTrue(solo.searchText("hello word",true));
		
		
	}

}
