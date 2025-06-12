
public class ThisKeyword {

	// I have same variable in global and in method
	// if i print the variable it will check inside and method and print
	// if we want to print the global variable we use "this" keyword

	int a=  2; //global variable
	int b = 3;
	
	
	public void num()
	{
		int a = 10; //local variable
		int b = 11;
		int c = a+this.b; // if user want to add global variable and local variable
		 System.out.println("Global variable : "+this.a+" "+this.b+"->"+"After adding a+b global+local : "+c); // to print global variables
		 System.out.println("Local variable : "+a+" "+b); // to print local variables
	}
	
	public void num1()
	{
		int a = 5;
		int b = 6;
		System.out.println("Global variable : "+this.a+ " "+this.b);
		System.out.println("Local variable : "+a+ " "+b);

	}
	
	
	public static void main(String[] args) {
	
	ThisKeyword p = new ThisKeyword();
	p.num();
	p.num1();
	
	}
	}
