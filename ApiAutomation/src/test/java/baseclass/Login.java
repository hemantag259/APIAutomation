package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Login extends ExtentReport {
	

	@Test
	public static void login()
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		extent = extentreport.createTest(name);
		driver.close();

		
	}
	

}
