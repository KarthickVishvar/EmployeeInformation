package com.employee.details;
import java.util.Scanner;

public class TestMarks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i =s.nextInt();
		System.out.println("Mark1=:" +i);
		int u = s.nextInt();
		System.out.println("Mark2=" +u);
		int g = s.nextInt();
		System.out.println("Mark3=" +g);
		int e =s.nextInt();
		System.out.println("Mark4=" +e);
		int p =s.nextInt();
		System.out.println("Mark5=" +p);
		int total = i+u+g+e+p;
		System.out.println("Total="+total);
		float average = total/5;
		System.out.println("Average="+average);
		}
	
}
