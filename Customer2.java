package com.dhill.arr;

import java.util.ArrayList;



public class Customer2 {

	public static void main(String[] args) {
		Service2 call=new Service2();
		call.getLavaMoblies();
	
	ArrayList<String> moblies=call.getLavaMoblies();
	moblies.size();
	System.out.println("numer of lava moblies:"+moblies.size());
	
	System.out.println(moblies);
}
}
