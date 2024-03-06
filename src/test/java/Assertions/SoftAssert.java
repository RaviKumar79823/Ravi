package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
@Test
public void dws() {
	String expectedhome = "https://demowebshop.tricentis.com/";
	String expectedreg = "https://demowebshop.tricentis.com/register";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://demowebshop.tricentis.com/");
     org.testng.asserts.SoftAssert softassert = new org.testng.asserts.SoftAssert(); 
     String actualhome = driver.getCurrentUrl();
     softassert.assertEquals(expectedhome, actualhome);
     driver.findElement(By.xpath("//a[@class='ico-register']")).click();
     String actualreg = driver.getCurrentUrl();
     driver.close();
     softassert.assertAll();
}

}
