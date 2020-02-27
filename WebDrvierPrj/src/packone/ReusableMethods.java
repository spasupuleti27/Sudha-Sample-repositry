package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableMethods {

	// method without argument is not suggested as we cannot use in future if URL changed
	WebDriver driver;
	public void launchApp()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hsinsysadm\\Desktop\\Sudha\\DRIVERS\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("Http://facebook.com");
		driver.manage().window().maximize();
	}
	
	
	public void closeApp()
	{
		driver.close(); // u cannot access driver if the variable created in method is local variable
		//and its scope is within  the method. So need to define the variabe driver as public above the method
	}
	
	//Method with Arguments
	public void launchAppWithArguments(String URL)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hsinsysadm\\Desktop\\Sudha\\DRIVERS\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	
	//Valdiate if email id or any other Id is present or not
	// ie., if email id is present - then boolean will return true else false
	//suppose if the validation is email element should not present then we make Exp as 'false' while calling method
	public void elementAvaialble(String locator, boolean exp)
	{
		boolean element = driver.findElement(By.id(locator)).isDisplayed();
		if(element ==exp)
			System.out.println("pass");
		else
			System.out.println("fail");
	}
	
	//validate the elements (culd be anchor tag/image or any) count
	//EG: Validate the links count
	public void elementsCount(String loc, int expnumber)
	{
		List<WebElement> elements = driver.findElements(By.tagName(loc));
		if(elements.size()== expnumber)
			System.out.println("pass");
		else
			System.out.println("fail");
		
		}
	

}
