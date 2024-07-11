package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register_DemoWebShop {
	@DataProvider
	public String[][] dataSender() {
		String[][] data= {{"female","sameera","A","sameerathahira@gmail.com","Sameera@123","Sameera@123"},
			            	{"male","mmkkjj","S","asdf@gmail.com","samjjh12","samjjh12"},
			            	{"female","himklh","k","fghytu@gmail.com","meera","meera"}};
		return data;
	}
	@Test(dataProvider = "dataSender")
	public void register(String[] cred ) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-"+cred[0]+""));
		driver.findElement(By.id("FirstName")).sendKeys(cred[1]);
		driver.findElement(By.id("LastName")).sendKeys(cred[2]);
		driver.findElement(By.id("Email")).sendKeys(cred[3]);
		driver.findElement(By.id("Password")).sendKeys(cred[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[4]);
	}

}
