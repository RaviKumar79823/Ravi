package Batch1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class4 {
	@Test(groups = {"smoke","regression"})
	public void nike() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/");
		Reporter.log("I am in nike",true);
		driver.close();
		
	}

}
