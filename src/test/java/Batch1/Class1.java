package Batch1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Class1 {
	@Parameters("url")
	@Test 
	public void amazon(String aUrl) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("I am in amz",true);
		driver.close();
		driver.get(aUrl);
		driver.quit();
	}
}
