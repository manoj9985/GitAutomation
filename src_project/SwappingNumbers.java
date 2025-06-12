
public class SwappingNumbers {

	public static void main(String[] args) {
		
		ThisKeyword key = new ThisKeyword();
		key.num();
		
		int a =10, b=20;
		
		System.out.println("Before swapping :"+ a +" " +b);

		/*
		//Logic 1 using 3rd variable
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("After swapping :"+ a +" " +b);
		
		*/
		
		/*
		//Logic 2 using operators + and -
		
		a = a+b; //10+20 =30
		b = a-b; //30-20 = 10
		a = a-b; //30-10 = 20
		
		System.out.println("After swapping :"+ a +" " +b);
		*/
		
		//Logic 3 using single statement
		
		b = a+b - (a=b);
		System.out.println("After swapping :"+ a +" " +b);

		
		
	}

}
