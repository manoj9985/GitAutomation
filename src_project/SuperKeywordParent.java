
public class SuperKeywordParent {

	
	//I have defined below variable in parent class, and creating same variable in child class
	String name = "Manoj";
	int num = 12345;
	char c = 'c';
	double d = 10.5;
	
	final void getData()
	{
		System.out.println("Im a parent class");
	}
	
	public SuperKeywordParent()
	{
		System.out.println("Parent constructor");
	}
}
