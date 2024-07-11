package listners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClass {
	@Test
	public void login() {
		
		Reporter.log("click on login link",true);
		 driver.findElement(By.linkText("Log in")).click();
		Reporter.log("enter valid credentials",true);
		driver.findElement(By.id("Email")).sendKeys("sameerashajeeb1802@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sameera@12");
		Reporter.log("click on login buton",true);
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","home page is not displayed");
		Reporter.log("home page is displayed",true);
		//Assert.assertEquals(true, false);
		
	}

}
