package packone;



import java.io.FileInputStream;
import java.util.List;
//import a

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSimilarElements {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hsinsysadm\\Desktop\\Sudha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver1 = new ChromeDriver();
	driver1.get("https://facebook.com");
	driver1.manage().window().maximize();
	
	//To find count of links in that page
	List<WebElement> links = driver1.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	//print all the links in that pa ge	
	int i;
	for(i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
	}
	
	//find the links that start wth P
	int j;
	for(j=0;j<links.size();j++)
	{
		
	String value = links.get(j).getText();
	if(value.startsWith("P")==true)
		System.out.println("lINK START WITH p" + value);

	
	}
	
	
	}
}
