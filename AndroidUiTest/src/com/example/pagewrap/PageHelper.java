package com.example.pagewrap;

import com.robotium.solo.Solo;

/*
 * PageHelper类，主要用来管理page类，提供统一的入口，方便获取page类
 * 
 */

public class PageHelper {
	
	private PageFirst pageFirst;
	private Solo solo;
	
	public PageHelper(Solo solo){
		
		this.solo=solo;
	}
	
	public PageFirst getPageFirst(){
		
		if(pageFirst==null){
			pageFirst=new PageFirst(solo);
		}
		
		pageFirst.pageInitViews();
		return pageFirst;
	}
	
	

}
