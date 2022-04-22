package com.bank.det;

public class IciciBank extends RbiBank {
	public void accountDetails() {
		System.out.println("name");
	  }
	public void branchDetails() {
		System.out.println("place");
	}
	public static void main(String[] args) {
		IciciBank s = new IciciBank();
		s.accountDetails();
		s.branchDetails();
		s.aadharDetails();
		
	}

}
