import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class SampleTestWebDriver {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\hsinsysadm\\Desktop\\Sudha\\DRIVERS\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://facebook.com");
		driver1.manage().window().maximize();
		driver1.close();*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hsinsysadm\\Desktop\\Sudha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://facebook.com");
		driver2.manage().window().maximize();
		//driver2.close();
		/*System.setProperty("webdriver.edge.driver", "C:\\Users\\hsinsysadm\\Desktop\\Sudha\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		driver3.get("https://facebook.com");
		driver3.manage().window().maximize();
		driver3.close();*/
		
		driver2.findElement(By.id("email")).sendKeys("mail2sri.p@gmail.com");
		driver2.findElement(By.id("pass")).sendKeys("saasd");
		driver2.findElement(By.id("day")).sendKeys("24");
		driver2.findElement(By.id("pass")).clear();
		driver2.close();
		
		
		
	}

}
