package com.TNSIF.Scanner;

public class Person {

	private String Name;
	private int Income;
	private int Tax;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getIncome() {
		return Income;
	}
	public void setIncome(int income) {
		this.Income = income;
	}
	public int getTax() {
		return Tax;
	}
	public void setTax(int tax) {
		this.Tax = tax;
	}
	@Override
	public String toString() {
		return "person [name=" + Name + ", income=" + Income + ", tax=" + Tax + ", getName()=" + getName()
				+ ", getIncome()=" + getIncome() + ", getTax()=" + getTax() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
