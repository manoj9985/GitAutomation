
public class AfricaTraffic implements CentralTraffic, continentalTraffic {

	public static void main(String[] args) {

		// when we implements the interface we have to use all the methods if not it throw an error at class name
		//class can implements multiple interface's, by separating ","
		// we have to created object, as we implementing the interface, we need to create object for interface
		CentralTraffic a = new AfricaTraffic(); 
		a.Red();
		a.yellow();
		a.Green();

		//creating object for inside the class method
		AfricaTraffic b = new AfricaTraffic();
		b.walk();
		
		//we need to create another object if we are implement another interface
		continentalTraffic c = new AfricaTraffic();
		c.TrainStop();
		
	}
	
	//if I'm creating a method in current class and which not on interface, we need to create another object for that method
	public void walk()
	{
		System.out.println("Walk");
	}

	@Override
	public void Red() {
		// here we need to maintain the body
		System.out.println("Red Light");

	}

	@Override
	public void yellow() {
		// here we need to maintain the body
		System.out.println("Yellow Light");

	}

	@Override
	public void Green() {
		// here we need to maintain the body
		System.out.println("Green Light");

	}

	@Override
	public void TrainStop() {

		System.out.println("Train Stop");
		
	}

}
