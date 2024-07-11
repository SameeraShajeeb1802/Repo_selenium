package assignment_listeners;



import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
	@Test
	public void login() {
	driver.findElement(By.linkText("Book")).click();
	Reporter.log("Books page is displayed",true);
	}

}
