
public class Palindrome {

	public static void main(String[] args) {
	
		String str = "Madam";
		String org_name = str;
		
		String rev = "";
		
		int len = str.length();
		
		for (int i=len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}		
		if (org_name.equals(rev))
		{
			System.out.println(rev + ": is a palindrome");
		}
		else {
			System.out.println(rev + ": is not a palindrome");

		}
	}

}
