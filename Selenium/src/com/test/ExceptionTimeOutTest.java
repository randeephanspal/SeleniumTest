package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
//	//stop the test after 2 sec
//	@Test(invocationTimeOut=2000)
//	public void infiniteLoopTest(){
//		int i=1;
//		while(i==1){
//			System.out.println(i);
//		}
//	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void parTest(){
			String x="100A";
			Integer z=Integer.parseInt(x);
			System.out.println(z);
			
		}
	
	

}
