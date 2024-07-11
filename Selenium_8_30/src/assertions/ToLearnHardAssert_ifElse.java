package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert_ifElse {
	@Test
	public void hardAsset() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		if (driver.getTitle().equals("Demo Web Shop")) {
			Reporter.log("login page is displayed");
		} else {
        Reporter.log("login page is not displayed");
		}
		
		driver.findElement(By.id("Email")).sendKeys("Sameerashajeeb1802@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sameera@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		if (driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/login")) {
			Reporter.log("home page is displayed");
		} else {
            Reporter.log("home page is not displayed");
		}
	}

}
