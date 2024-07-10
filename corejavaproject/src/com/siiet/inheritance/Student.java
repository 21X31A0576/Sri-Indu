package com.siiet.inheritance;

public class Student extends Citizen {
	
	private int rollno;
	private String collegename;
	public Student() {
		super();

	}
	public Student( int rollno, String collegename) {
		
		this.rollno = rollno;
		this.collegename = collegename;
	}
	public Student(String name, long adharno, String address, long phno) {
		super(name, adharno, address, phno);
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + ", getRollno()=" + getRollno()
				+ ", getCollegename()=" + getCollegename() + ", getName()=" + getName() + ", getAdharno()="
				+ getAdharno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
