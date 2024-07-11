package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(priority = 1)
	public void register() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
  Reporter.log("register testcase is executed",true);
  }
	@Test(dependsOnMethods = "register")
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login testcase is executed",true);
	}

}
