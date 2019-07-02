package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\Arul\\Launch\\driver\\chromedriver.exe");
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("priyatamil08@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("123456");
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		login.click();
		driver.close();*/
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://greenstech.in/selenium-course-content.html");
		WebElement questions=driver1.findElement(By.className("pointer"));
		questions.click();
		
		
		
	
	}

}
