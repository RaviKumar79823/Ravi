package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chronological_Oder {
	WebDriver driver  = new ChromeDriver();
@BeforeSuite
public void beforesuite() {
	System.out.println("beforesuite");
}
@BeforeTest
public void beforetest() {
	System.out.println("beforetest");
}
@BeforeClass
public void beforeclass() {
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
}
@BeforeMethod
public void beforemethod() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("ravi.kmr.email@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("ravi1234");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
@Test
public void addtocart() throws InterruptedException {
	driver.findElement(By.linkText("Digital downloads")).click();
 	List<WebElement> addtocart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
 	for (WebElement web : addtocart) {
 		web.click();}
 		Thread.sleep(1000);
 		 WebElement cart = driver.findElement(By.linkText("Shopping cart"));
 		 cart.click();
 	 List<WebElement> products = driver.findElements(By.xpath("//a[@class='product-name']"));
 	 if(products.isEmpty()) {
 		 System.out.println("the pproduct is not added");
 		 
 	 }
 	 else
 		 System.out.println("the product is added");
 		
		
	}

@AfterMethod
public void aftermethod() {
	driver.findElement(By.linkText("Log out")).click();
}
@AfterClass
public void afterclass() {
	driver.close();
}
@AfterTest
public void aftertest() {
	System.out.println("AfterTest");
}
@AfterSuite
public void aftersuite() {
	System.out.println("Aftersuite");
}
}
