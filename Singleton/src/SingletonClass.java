package org.yogi.test;

public class SingletonClass {
	
	
	private static int counter = 0;
	private static SingletonClass instance = null;
	
	
	
	
	
	
	private SingletonClass()
	{
		counter++;
		System.out.println("Counter Value" + counter);
		
	}
	
	
	public void PrintDetails(String msg)
	{
		System.out.println(msg);
	}





	public static SingletonClass getInstance() {
		if (instance==null) 
		{
        	instance = new SingletonClass();
		}
		 return instance; 
	}
	
}
