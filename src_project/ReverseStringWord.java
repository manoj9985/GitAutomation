
public class ReverseStringWord {

	public static void main(String[] args) {
			
		String str = "Selenium Automation Tester";
		String[] words = str.split(" ");
		
		String rev = "";
		
		for (String w: words)
		{
			String reverseWords = "";
			
			for(int i=w.length()-1; i>=0; i--)
			{
				reverseWords = reverseWords+w.charAt(i);
			}
			rev = rev+reverseWords+" ";
		}
		
		System.out.println(rev);
	}

}
