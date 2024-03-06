package Assertions;

import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardTest {
@Test
public void dws() {
	String expected = "https://demowebshop.tricentis.com";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://demowebshop.tricentis.com/");
	String actual = driver.getCurrentUrl();
	assertNotEquals(expected, actual);
	System.out.println("My script is successful.....");
	
}
}
