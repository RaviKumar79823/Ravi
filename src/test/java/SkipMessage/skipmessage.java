package SkipMessage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class skipmessage {
@Test(timeOut = 1000)
public void redbus() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https:www.redbus.in");
	Thread.sleep(2000);
	driver.close();
}
@Test   (dependsOnMethods = "redbus")
public void DWS() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https:demowebshop.tricentis.com");
	driver.close();
}

}
