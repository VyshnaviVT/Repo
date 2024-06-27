package inheritance;

import java.util.Scanner;


public class ParentPay {
	 
	double bp,d,b;
	
	public void pay() {
	
	Scanner sc=new Scanner(System.in); 
	  
	System.out.println("Enter Basic pay:");
    bp= sc.nextInt();
	System.out.println("Enter Deduction");
	d=sc.nextFloat();
	System.out.println("Enter Bonus");
	b=sc.nextFloat();
	}
}
