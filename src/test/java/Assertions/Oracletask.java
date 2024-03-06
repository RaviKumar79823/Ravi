package Assertions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Oracletask {
@Test
public void oracle() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	 WebElement link = driver.findElement(By.linkText("jdk-8u401-linux-x64.rpm"));
	
	assertTrue(link.isDisplayed());
	link.click();
	SoftAssert soft = new SoftAssert();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement download = driver.findElement(By.linkText("Download jdk-8u401-linux-x64.rpm"));
	
	soft.assertTrue(download.isEnabled());
	js.executeScript("arguments[0].click()", download);
	soft.assertAll();
}

}
