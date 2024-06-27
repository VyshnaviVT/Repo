package inheritance;

public class ChildB extends ChildA{
	public void dis3()
	{
		System.out.println("This is childB");
	}
	
	public static void main(String[] args) {
		 
		ChildB obj=new ChildB();
		obj.dis();
		obj.dis2();
		obj.dis3();

	}

}
