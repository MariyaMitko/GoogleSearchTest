package by.mitsko.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
	
	private final String BASE_URL = "http://google.by";

	
	public MainPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	
	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
	}

	
	  

}
