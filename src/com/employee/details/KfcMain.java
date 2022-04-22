package com.employee.details;

public class KfcMain implements KfcCity,KfcUdi {
	
      @Override
      public void logoAndTheme() {
    	  System.out.println("KFC");
}
      @Override
    public void furniture() {
       System.out.println("wood");
    }
      public void employee() {
    	  System.out.println("20");
      }
      @Override
    public void chairs() {
    	  System.out.println("500");
    }
      public static void main(String[] args) {
	   KfcMain k = new KfcMain();
	   k.employee();
	   KfcCity l = new KfcMain();
	   l.logoAndTheme();
	   l.furniture();
	   KfcUdi n = new KfcMain() ;
	   n.chairs();
}
}
