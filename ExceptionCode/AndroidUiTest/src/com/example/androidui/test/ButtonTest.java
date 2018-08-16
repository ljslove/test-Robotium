package com.example.androidui.test;

//import android.util.Log;

public class ButtonTest extends BasicActivity {
	
	public ButtonTest(){
		super();
	}
	
	
  /*   该条case的setUp()有异常，并不影响后续的case执行
	
 	@Override
	protected void setUp() throws Exception{
		
		try{
			super.setUp();
			int a=0;
			int b=3/a;
		}catch(Exception ex){
			Log.d("ButtonTest","Exception happened in setUp,the error msg is "+ex.getMessage());
			tearDown();
			throw ex;
		}
		
	}*/
	
	
	public void testProgressBarButton(){
		
		/*
		 * runTest()中的异常处理，本条case测试fail，不影响下一条case运行，并且打印自己定制的log信息
		 * 
		 */
		
		//assertTrue(false);   
	      
		helper.getPageFirst().clickPreogerssButton();
		
		
	}

}
