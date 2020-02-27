package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class RCCommand_InWebDriver {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hsinsysadm\\Desktop\\Sudha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver= new FirefoxDriver();
	WebDriver driver2 = new ChromeDriver();
	driver2.get("https://facebook.com");
	driver2.manage().window().maximize();
	WebDriverBackedSelenium s = new WebDriverBackedSelenium(driver2,"http://" );
	s.type("id=email", "mail2sri.p@gmail.com");
	s.select("id=day", "24");
	

	}

}
