package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
	
	@Test
	public void hardAssert() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Log in")).click();
	    String loginTitle = driver.getTitle();
	   // Assert.assertEquals(loginTitle, "Demo Web Shop. Login","login page is not displayed");(Scrit pass)
	    Assert.assertEquals(loginTitle, "Demo Web Shop. ","login page is not displayed");

	    Reporter.log("login page is displayed",true);
	    
	    driver.findElement(By.id("Email")).sendKeys("Sameerashajeeb1802@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sameera@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page is not displayed");
		Reporter.log("home page is displayed",true);
	
	}

}
