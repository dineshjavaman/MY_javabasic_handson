package com.dhill.arr;

public class Moblie {

	public static void main(String[] args) {
		mobservice b=new mobservice();
		b.getmobdet();
		Details de=b.getmobdet();
		//Details mob = new Details(); 
		// mob.setName("nokia");
		// mob.setmhp(2000);
		// mob.setprice(15000);
		 System.out.println(de.getName());
		 System.out.println(de.getmhp());
		 System.out.println(de.getprice());
		// System.out.println("mobile price: " +mob.getprice());
		 //System.out.println("mobile mhp: " +mob.getmhp());
	}

}
