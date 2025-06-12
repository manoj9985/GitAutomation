
public class overLoading {

	public static void main(String[] args) {

		overLoading ol = new overLoading();
		ol.name(2);
		ol.name("Manoj");
		ol.name(10, 11);

	}

	// when multiple methods have same name with in the same class but having different arguments that is overloading
	// either argument should be different or data type should be different

	public void name(int a) 
	{
		System.out.println(a);
	}

	public void name(String name) 
	{
		System.out.println(name);

	}
	
	public void name(int a, int b)
	{
		System.out.println(a+" "+b);
	}
}
