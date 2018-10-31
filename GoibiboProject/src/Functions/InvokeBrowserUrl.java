package Functions;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowserUrl {
	
	static WebDriver driver = new ChromeDriver();
	
	public static void CallDriver() {
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.goibibo.com/");

		System.out.println("******************Url Opened Successfully!**************");

	}


}
