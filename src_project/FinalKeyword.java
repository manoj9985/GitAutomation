
public class FinalKeyword {
	
	
	final void getname()
	{
		
		System.out.println("Final keyword");
	
	}
	

	public static void main(String[] args) {
		
		//If we declare any variable as final, then we cannot change to other number
		//When a value we feel that as constant, then we make It as final
		//If we make class name as final, we cannot access (inherit) to any other class
		//If we make method as final, we cannot override the method
		
		final int i = 3;
		//i = 5; // we cannot change the i value when we declare as final
		
		FinalKeyword fk = new FinalKeyword();
		fk.getname();
		
		
	}

}
