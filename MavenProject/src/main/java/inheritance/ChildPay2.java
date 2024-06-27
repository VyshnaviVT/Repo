package inheritance;

public class ChildPay2 extends ChildPay1{
	double ts;
	
	public void totalSal() {
		ts=bp+hra-pf-d+b;
	  
	  System.out.println("salary slip:");
	  System.out.println("Basic pay: "+bp);
	  System.out.println("Deduction: "+d);
	  System.out.println("HRA: "+hra);
	  System.out.println("PF: "+pf);
	  System.out.println("Bonus: "+b);
	  System.out.println("Total Salary: "+ts);
	}
	
	public static void main(String[] args) {
		ChildPay2 c=new ChildPay2();
		c.pay();
		c.hra();
		c.totalSal();
		
	}
}


