package inheritance;

public class ClassBHyrar extends ParentHyrar{
	
	public void dis3()
	{
		System.out.println("This is childB");
	}

	public static void main(String[] args) {
		 
			ClassBHyrar B=new ClassBHyrar();
			B.dis();
			B.dis3();
			}

}
