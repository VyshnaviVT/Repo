package inheritance;

public class Divisible extends AdditionResult{
	
	public Divisible() {
		
		super.add();
		
		if(sum%10==0) {		
	        System.out.println(sum+" is divisible by 10");
	         	}
			
			else {
			System.out.println(sum+" is not divisible by 10");	
	           }
	}

	public static void main(String[] args) {
	
			Divisible obj=new Divisible();
		
}
}