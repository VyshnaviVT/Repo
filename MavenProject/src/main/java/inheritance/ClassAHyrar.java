package inheritance;

public class ClassAHyrar extends ParentHyrar {
	
	public void dis2() {
		System.out.println("This is childA");
	}
	public static void main(String[] args) {
		ClassAHyrar A=new ClassAHyrar();
        A.dis2();
        A.dis();
	}

}
