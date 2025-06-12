
public class ReverseString {


	public static void main(String[] args) {
		
		String str = "Selenium Automation";
		
		/*
		String rev = "";
		
		int len = str.length();
		
		for (int i = len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
		*/
	
		/*
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		*/
		String rev = "";
		char a[] = str.toCharArray();
		int len = a.length;
		for (int i = len-1; i>=0; i--)
		{
			rev = rev+a[i];
		}
			System.out.println(rev);
	}

}
