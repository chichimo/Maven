package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest {
	WebDriver driver;
	
	@Test
	public void mavenTest() {
		System.out.println("This is my first maven test");
		System.setProperty("phantomjs.binary.path", "C://Users//hashi//Downloads//PhantoJs//phantomjs-2.1.1-windows//bin//phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://amazon.com");
		WebElement logo=driver.findElement(By.xpath(".//*[@id='nav-logo']/a[1]/span[1]"));
		if(logo.isDisplayed()) {
			System.out.println("The logo is present");
		}else {
			System.out.println("The logo is not present");
		}
		
		//driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		
		String title = driver.getCurrentUrl();
		System.out.println(title);
		driver.getTitle();
		
		
		
		
		
		
		
	}

}
