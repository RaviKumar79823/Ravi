package Batch2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class9 {
	@Test
	public void cobb() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cobbitaly.com/");
		Reporter.log("I am in cobb",true);
		driver.close();
		
	}
}
