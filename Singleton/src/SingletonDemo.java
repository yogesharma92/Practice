package org.yogi.test;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass onject1 = SingletonClass.getInstance();
		onject1.PrintDetails("Call from onject1 successfull");
		
		SingletonClass onject2 = SingletonClass.getInstance();
		onject2.PrintDetails("Call from onject2 successfull");
		

	}

}
