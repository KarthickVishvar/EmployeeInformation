package org.emp;

public class Employee {
public void empId(int a) {
	a=15;
	System.out.println("id:"+a);
	}
public void empId(String b,int a) {
	b="surya";
	a=25;
	System.out.println("Name:"+b);
	System.out.println("id:"+a);
	}
public void empId(int a,String c) {
	a=15;
	c="Albert";
	System.out.println("name:"+c);
	System.out.println("id:"+a);
	}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId(0);
	e.empId(0, null);
	e.empId(null, 0);
}
}
