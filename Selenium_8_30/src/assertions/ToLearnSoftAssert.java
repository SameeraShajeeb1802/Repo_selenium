package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	@Test
	public void softAssert() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		String loginLink = driver.getTitle();
		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(loginLink, "Demo Web Shop. Login","login page is not displayed");
		soft.assertEquals(loginLink, "Demo Web Shop. ","login page is not displayed");
		
		driver.findElement(By.id("Email")).sendKeys("Sameerashajeeb1802@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sameera@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
	   //	soft.assertEquals(driver.getTitle(), "Demo Web Shop","home page is not displayed");
		soft.assertEquals(driver.getTitle(), "Demo Web ","home page is not displayed");
		
		soft.assertAll();
	}

}
