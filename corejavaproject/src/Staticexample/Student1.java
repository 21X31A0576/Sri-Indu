package Staticexample;

public class Student1 {

	int rollno;
	String name;
	static String college="Sri Indu";//static member
	static void change() {//static method
		
		college="IIT";
	}
	Student1(int r, String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+""+name+""+college);
	}
}

