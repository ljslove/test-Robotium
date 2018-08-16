package com.example.androidui.test;





public class FirstTest extends BasicActivity {
	
	
	
	public FirstTest(){
		super();
	}
	
	public void testTextView(){
		solo.sleep(5000);
		assertTrue(solo.searchText("This a TextView",true));	
	}
	
	public void testImageView(){
		helper.getPageFirst().clickImageViewButton();
	}
	
	
}
