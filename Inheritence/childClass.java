import org.openqa.selenium.chrome.ChromeDriver;

public class childClass extends ParentClass {

	public static void main(String[] args) {

		// create object with child class, as it extends the parent class we can access all the methods
		// ParentClass pc = new ParentClass();
		//Multiple inheritances do not allow in java (ex., classname extends parent1, parent2 )
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();

		childClass cc = new childClass();
		cc.inventoryAdjustment();
		cc.scrap();
		cc.shipmentReceipt();
		cc.RMA();

	}

	void shipmentReceipt() {
		System.out.println("User able to land on Shipment Receipt screen");
	}

	private void RMA() {
		System.out.println("User able to land on RMA screen");

	}

}
