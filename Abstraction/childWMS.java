
public class childWMS extends WMS { 
	
	private static int a = 2;

// inherited abstract class, need to add all methods which does not have bodys

	public static void main(String[] args) {

		//create object for child class
		//we cannot create object for abstract parent class
		
		WMS m = new childWMS();
		m.waveManagement();
		
		childWMS landPage = new childWMS();
		landPage.waveManagement();
		landPage.ladManagement();
		landPage.allocatedPicks();
		landPage.unallocatedPicks();
		landPage.pickDetails();
		
		
	}


	@Override
	public void allocatedPicks() {
		System.out.println("User able to land on allocated picks page");
	}

	@Override
	protected void unallocatedPicks() {
		System.out.println("User able to land on unallocated picks page");

	}

	@Override
	void pickDetails() {
		System.out.println("User able to land on pick detail page");

	}

}
