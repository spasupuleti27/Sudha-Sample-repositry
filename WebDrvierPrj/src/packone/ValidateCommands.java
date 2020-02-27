package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spasupuleti\\Desktop\\Sudha\\DRIVERS\\chromedriver_win32.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://facebook.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("email")).sendKeys("mail2");
		boolean a =driver1.findElement(By.id("pass")).isDisplayed();
		if(a==true)
			System.out.println("pass");
		else
			System.out.println("fail");
		boolean b =driver1.findElement(By.id("pass")).isEnabled();
			if(b==true)
				System.out.println("pass");
			else
				System.out.println("fail");
				System.out.printl("sample fail");
		
		

	}

}
