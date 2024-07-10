package throwexample;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no");
		int rollno=sc.nextInt();
		
	
	if(rollno<0) {
		throw new ArithmeticException("Rollno cannot be negative");
		
	}
	else {
		System.out.println("Valid rollno");
	}
	}
		
}
