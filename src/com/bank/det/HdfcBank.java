package com.bank.det;

public class HdfcBank extends RbiBank {
	public void balanceDetails() {
		System.out.println("statement");
	  }
	public void paymentDetails() {
		System.out.println("available");
	}
	public static void main(String[] args) {
		HdfcBank k = new HdfcBank();
		k.balanceDetails();
		k.paymentDetails();
		k.aadharDetails();
		
	}

}
