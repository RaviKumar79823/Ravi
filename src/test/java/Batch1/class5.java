package Batch1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class5 {
	@Test
	public void addidas() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adidas.co.in/");
		Reporter.log("I am in addidas",true);
		driver.close();
		
	}
}
