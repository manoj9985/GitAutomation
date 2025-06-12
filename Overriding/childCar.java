
public class childCar extends Car{

 
	//parent and child methods name, arguments, data types everything will be same
	//when we call the method child class will override the parent class and execute the child methods
	
	public void petrolCar ()
	{
		System.out.println("Child Petrol car");
	}
	
	public void automaticCar()
	{
		System.out.println("Child Automatic car");
	} 
	
	public static void main(String[] args) {

		childCar cc = new childCar();
		cc.petrolCar();
		cc.automaticCar();
		
	}

	
}
