package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lemborghini {
	@Test(groups = {"system","smoke"})
	public void launchLemborghini() {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.lamborghini.com/en-en");
    Reporter.log("Lemborghini launch successfull",true);
	}
}
