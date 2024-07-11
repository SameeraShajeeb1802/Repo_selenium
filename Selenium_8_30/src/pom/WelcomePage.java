package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//initialization
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id="small-searchterms")
	private WebElement searchTxtFld;
	
	//provide getters
	
	public WebElement getSearchTxtFld() {
		return searchTxtFld;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	
}
