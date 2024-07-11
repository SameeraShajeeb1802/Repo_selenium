package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShopSearch {
	@DataProvider
	public String[] dataSender() {
		String[] data= {"mobiles","abcdefg","1234567","%$#@123","AbCDF$3@"};
		return data;
	}
	@Test(dataProvider = "dataSender")
	public void search(String data) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("small-searchterms")).sendKeys(data);
	}

}
