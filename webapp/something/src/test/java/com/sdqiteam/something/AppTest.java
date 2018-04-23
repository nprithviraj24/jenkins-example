package com.sdqiteam.something;
//import junit.framework.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;		
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {
	private WebDriver driver;
	
	@Before
	public void testSetUp() {
		System.setProperty("webdriver.com.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void load() {
		driver.navigate().to("http://localhost:8181/paymentJSP/login.html");
		driver.findElement(By.id("id")).sendKeys("testuser_1"); 	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	    driver.findElement(By.id("login")).click();
		String title = driver.getTitle();
		assertTrue(title.contains("Payment"));
	}
	
	@After
	public void tearDown() {
		// driver.quit();
	}
	
	
}

//
//package com.sdqiteam.something;
//
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//
///**
// * Unit test for simple App.
// */
//public class AppTest 
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
// 
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}