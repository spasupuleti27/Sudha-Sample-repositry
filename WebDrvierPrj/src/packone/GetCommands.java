package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hsinsysadm\\Desktop\\Sudha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://facebook.com");
		driver1.manage().window().maximize();
		
		String a = driver1.findElement(By.id("email")).getAttribute("class");
		System.out.println(a);
		String b = driver1.findElement(By.id("email")).getAttribute("name");
		System.out.println(b);
		
		System.out.println(driver1.findElement(By.id("email")).getTagName());
		System.out.println(driver1.findElement(By.id("email")).getSize());
		System.out.println(driver1.findElement(By.id("email")).getLocation());
		
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getWindowHandle());
		//System.out.println(driver1.getPageSource()); - this will show source code
		//and will hang need to restart if executed
		
		driver1.navigate().refresh();
		driver1.navigate().back();
		driver1.navigate().forward();
		driver1.manage().window().fullscreen();	
		

	}

}
