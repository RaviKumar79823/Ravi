package Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecutingMultipleTestAnnotation {
@Test
public void dws() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("Iam from Dws",true);
	driver.close();
}
@Test
public void csk() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.chennaisuperkings.com/");
	Reporter.log("Iam from csk",true);
	driver.close();
}
@Test
public void nike() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.nike.com/in/");
	Reporter.log("Iam from nike",true);
	driver.close();
}
public void Rcb() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.royalchallengers.com/");
	Reporter.log("Iam from Rcb",true);
	driver.close();
}
}