package com.dhill.arr;

import java.util.ArrayList;

import hi.service;

public class Customer1 {

	public static void main(String[] args) {
		
			service call =new service();
		call.getmobilelist();
		
		ArrayList<String> moblies =call.getmobilelist();
		moblies.size();
		
		int number=moblies.size();
		System.out.println("numberof mobile we have:"+number);
		System.out.println( moblies);
		
		
	}

}
