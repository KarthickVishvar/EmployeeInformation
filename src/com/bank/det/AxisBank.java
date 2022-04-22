package com.bank.det;

public class AxisBank extends RbiBank {
	
	public void salaryDetails() {
		System.out.println("10000");
	  }
	public void proofDetails() {
		System.out.println("sign");
	}
    public static void main(String[] args) {
    	AxisBank i = new AxisBank();
    	i.salaryDetails();
    	i.proofDetails();
    	i.aadharDetails();
    }
    
}

