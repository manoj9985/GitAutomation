
public class AccountMain {

	public static void main(String[] args) {

		Account ac = new Account();
		ac.setName("Manoj");
		ac.setAccountNum(1234567890);
		ac.setAge(32);
		
		System.out.println(ac.getName());
		System.out.println(ac.getAccountNum());
		System.out.println(ac.getAge());
	}

}
