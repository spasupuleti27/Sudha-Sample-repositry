package packone;

public class AbsoluteXpath {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spasupuleti\\Desktop\\Sudha\\DRIVERS\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\spasupuleti\\Desktop\\Sudha\\DRIVERS\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://facebook.com");
		driver.manage().window().maximize();*/
	}

}
