package com.citizant.orderonline;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OrderOnlineTest {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
 
	 
	@Before
	public void setUp() throws Exception {
	    System.out.println("* * * Test Started! * * *");
	    System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe");
	    
	}

	@Test
	public void bootcampjavatest() throws Exception {
		 
		  WebDriver driver = (WebDriver) new InternetExplorerDriver();
	      driver.get("http://localhost:8181");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      
	     
driver.findElement(By.name("username")).sendKeys("Lakshmi");
driver.findElement(By.name("password")).sendKeys("dummy");
driver.findElement(By.name("submit")).click();
//driver.findElement(By.partialLinkText("long")).click();
//driver.findElement(By.cssSelector("a[href*='add-todo']")).click();
//driver.findElement(By.partialLinkText("add-todo")).click();
//driver.findElement(By.xpath("//a[@href='/list-todos']")).click();

//driver.findElement(By.xpath("//a[contains(@href,'/list-todos')]")).click();
}
}

