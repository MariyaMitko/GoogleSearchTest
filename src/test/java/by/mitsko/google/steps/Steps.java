package by.mitsko.google.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import by.mitsko.google.driver.SingletonDriver;
import by.mitsko.google.pages.MainPage;

public class Steps {

	private WebDriver driver;

	private final Logger logger = LogManager.getRootLogger();

	public void initBrowser()
	{
		driver = SingletonDriver.getDriver();
	}

	public void closeDriver()
	{
		SingletonDriver.closeDriver();
	}

	public void page()
	{
		MainPage page = new MainPage(driver);
		page.openPage();
	}

	public void fingJava(){
		WebElement someElement = driver.findElement(By.name("q"));
		someElement.sendKeys("Java");
	        someElement.submit();
		logger.info("Searching was started")
	}
	
	public void openLink (){
		WebElement link = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[1]/div/div/h3/a"));
		link.click();
		logger.info("First link was opened")
		
		
	}
	public String getText(){
		
		WebElement text = driver.findElement(By.xpath("/html/body"));
		return text.getText();
		logger.info("Text informatoin from page was received")
		
	}

}
