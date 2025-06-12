
public class CountNumberOfDigitsinaNumber {

	public static void main(String[] args) {
		
		long num = 123456789;
		
		//when a number start with "0" java will treat it as octal number which leads to an complier error
		//for this we can place number in a string to print all the numbers
		
		//Logic 1
		
		long count = 0;
		
		while (num > 0)
		{
			num = num/10;
			count++;
		}
		
		System.out.println(count);
		
		
		
		/*
		//Logic 2
		
		int len = String.valueOf(num).length();
		System.out.println(len);
		*/
	}

}
