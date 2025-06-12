
public class CountEvenAndOddDigits {

	public static void main(String[] args) {

		long num = 981209123;

		int evenCount = 0;
		int OddCount = 0;

		while (num > 0) {
			// num%10 this will extract the last digit and store in the rem variable
			long rem = num % 10;
			if (rem % 2 == 0) {
				// below will print each number
				System.out.println(rem + " : Even number digit");
				evenCount++;
			} else {
				// below will print each number
				System.out.println(rem + " : Odd number digit");
				OddCount++;
			}

			num = num / 10; // this will eliminate last digit

		}
		System.out.println("************");
		System.out.println(evenCount + " : Even Number count");

		System.out.println(OddCount + " : Odd Number count");

	}

}
