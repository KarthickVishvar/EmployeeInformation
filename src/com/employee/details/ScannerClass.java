package com.employee.details;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bio Details");
		String i = s.next();
		System.out.println("Name :"+i);
		int v = s.nextInt();
		System.out.println("EmpId :"+v);
		String o = s.next();
		System.out.println("Mailid :" +o);
		long m = s.nextLong();
		System.out.println("PhNo :"+m);
		int n = s.nextInt();
		System.out.println("Salary :"+n);
		String b = s.next();
		System.out.println("Gender :" +b);
		String a = s.next();
		System.out.println("City :" +a);
	}
	
}
