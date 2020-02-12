package io.github.pratikrane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
	}

	@Test
	public void startWebPage() {
		driver.get("https://www.google.com");

	}

	@AfterClass
	public void cleanUp() {
		if (driver != null) {
			driver.quit();
		}
	}
}
