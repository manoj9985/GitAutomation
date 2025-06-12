
public class Account {

	//Wrapping up of data and methods into a single unit (class).
	//For every variable there will be 2 method (setters and getters)
	//Setters method will set the data from the variable
	//Getters method will read or get the data from the variable (return the variable)
	//Every variable will be private
	//we can create getter and setter by clicking on source> Generate getter and setter option

	private String name;
	private int age;
	private int accountNum;
	
	
	String getName()
	{
		return name;
	}
	
	void setName(String name) 
	{
		//if we are not using this keyword that method does not know from where we need to get the variable
		//if we define this keyword it will call the variable under the declared class variable
		this.name = name;
	}	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	protected int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum=accountNum;
	}
	
	
}
