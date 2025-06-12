import org.openqa.selenium.WebDriver;

public class ParentClass {

	static WebDriver driver = null;	
	static String url = "https://courses.rahulshettyacademy.com/";
	
	public void inventoryAdjustment()
	{
		System.out.println("User able to land on Inventory adjustment screen");
	}
	
	protected void scrap()
	{
		System.out.println("User able to land on Scrap screen");	
	}
	
	

}
