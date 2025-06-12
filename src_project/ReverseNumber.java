
public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 123450;
				
		
		int rev = 0;
		//using while loop, but with this approach the system doesn't print "0"
		while (num !=0)
		{
			rev = rev*10+num%10; //num%10 will extract last number from the digit and store in rev 
			num=num/10; //this will eliminate the last digt
		}
		System.out.println(rev);
		
		
		/*
		//using string buffer
		StringBuffer sb = new StringBuffer(String.valueOf(num)); //we are changing integer to string and reversing
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		*/
		
		/*
		//String Builder
		StringBuilder sb = new StringBuilder(num);
		sb.append(num); // we can use append in String builder to convert into string
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
		
		*/
	}

}
