package com.dhill.arr;

public class Viewemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee("Deep", 23435, "TCS");
		String name = em.getName();
		int id = em.getId();
		String nCompany = em.getNCompany();
		System.out.println("Employee's name: " + name);
		System.out.println("Employee's id: " + id);
		System.out.println("Company's name: " + nCompany);
	}

}
