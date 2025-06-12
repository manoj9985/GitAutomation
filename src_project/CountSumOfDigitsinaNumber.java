
public class CountSumOfDigitsinaNumber {

	public static void main(String[] args) {

		int num = 12345;
		
		int sum = 0;
		
		while (num > 0)
		{
			sum = sum+num%10; // this will extract last digit and store in sum, and it will add to the next number on the iteration
			num = num/10; // this will eliminate the last digit
		}
		
		System.out.println(sum);
		
	}

}
