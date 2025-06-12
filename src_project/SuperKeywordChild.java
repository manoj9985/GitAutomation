
public class SuperKeywordChild extends SuperKeywordParent{ //inherited with parent class
	
	//using the same variable which are present in parent class

	String name = "Automation";
	int num = 54321;
	char c = 'A';
	double d = 1.1;
	
	//creating methods
	//we use super keyword to access the parent variables
	//if we user this keyword it will access the current class of global variables
	public void name()
	{
		System.out.println(super.name); 
	}
	public void num()
	{
		System.out.println(super.num);
	}
	public void c()
	{
		System.out.println(super.c);
	}
	public void d()
	{
		System.out.println(super.d);
	}
	
	//using the same method which is in parent class
	public void getData1()
	{
		super.getData(); //this will access the parent class
		System.out.println("Im a child class");
	}
	
	public SuperKeywordChild()
	{
		super();
		System.out.println("child constructor");
	}
	
	public static void main(String[] args) {
		
		SuperKeywordChild sc = new SuperKeywordChild();
		sc.name();
		sc.num();
		sc.c();
		sc.d();
		sc.getData1();
		
		
	}

}
