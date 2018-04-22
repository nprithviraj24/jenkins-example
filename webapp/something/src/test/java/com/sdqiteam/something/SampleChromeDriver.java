package com.sdqiteam.something;
//import junit.framework.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SampleChromeDriver {
	private WebDriver driver;
	
	@Before
	public void scratch() {
		System.setProperty("webdriver.com.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void toDo() {
//		driver.quit();
	}
	
	@Test
	public void load() {
		driver.navigate().to("https://www.youtube.com");
		String title = driver.getTitle();
		assertTrue(title.contains("YouTube"));
	}
	
}
