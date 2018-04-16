package by.mitsko.google;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.mitsko.google.steps.Steps;

public class GoogleSearchTest {
	private WebDriver driver;
	private Steps st;

	@BeforeTest
	public void browser() {
		st = new Steps();
		st.initBrowser();
	}

	@Test
	public void searchTest() {

		st.page();
		st.fingJava();
		st.openLink();
		Assert.assertTrue(st.getText().contains("Java"));

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
