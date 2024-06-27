package inheritance;
public class Super2 extends SuperKey{
	
	public Super2() {
		super();
		System.out.println("Sum");
		System.out.println(super.a);
		super.add();
		
	}

	public static void main(String[] args) {
		
		Super2 obj=new Super2();
	}

}
