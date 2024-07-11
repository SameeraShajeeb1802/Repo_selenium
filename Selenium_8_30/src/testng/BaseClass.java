package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(@Optional("chrome")String browserName) {
		driver=new ChromeDriver();
		if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/login");
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sameerashajeeb1802@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sameera@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
	}
	@AfterMethod
     public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}
@AfterClass
public void closeBrowser() {
	driver.quit();
}
}
