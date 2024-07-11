package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
//		WebElement searchTxtFld = driver.findElement(By.id("small-searchterms"));
//		searchTxtFld.sendKeys("mobiles",Keys.ENTER);
//		searchTxtFld.sendKeys("selenium");
		WelcomePage wp=new WelcomePage(driver);
		wp.getSearchTxtFld().sendKeys("moiles",Keys.ENTER);
		wp.getSearchTxtFld().sendKeys("selenium");
		
	}

}
