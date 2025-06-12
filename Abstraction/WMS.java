
public abstract class WMS { // if one method is declared as abstract then class should also be abstract

	
	public void waveManagement()
	{
		System.out.println("User able to land on Wave Management screen");
	}
	
	public void ladManagement()
	{
		System.out.println("User able to land on Load Management Screen");
	}
	
	//there is no body to this method, we have to make to abstract method
	//we can use only public, protected access modifiers
	//we cannot use private as this abstract class is implemented to access all the methods and cannot hide any methods
	public abstract void allocatedPicks(); 
	protected abstract void unallocatedPicks();
	abstract void pickDetails(); //if there is no access modifier, then it will treat as public 
	//private void profileManagement(); //throws error, because of private access modifier

	
}
