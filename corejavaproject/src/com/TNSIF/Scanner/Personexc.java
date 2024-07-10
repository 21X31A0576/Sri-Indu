package com.TNSIF.Scanner;

public class Personexc {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter person name");
		String name = sc.nextLine();
		System.out.println("enter person's income");
		String income = sc.nextLine();
		
	    Person pp = new Person();
		pp.setName(name);
		pp.setIncome(50000);
        TaxCalculation t = new TaxCalculation();
		t.calculatetax(pp);
		System.out.println("After Modification");
		System.out.println(pp);
		
	}
}
//personexc

