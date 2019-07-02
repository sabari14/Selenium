package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\Arul\\Launch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement txtuserName=driver.findElement((By.xpath("//span[text()='Account & Lists'])[1]")));
	Actions acc=new Actions(driver);
	acc.moveToElement(txtuserName).perform();
	WebElement txtuser1 = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
	txtuser1.click();
	WebElement txtuser2 = driver.findElement(By.xpath("//input[@type='text']"));
	txtuser2.sendKeys("bebbo");
	WebElement txtuser3 = driver.findElement(By.xpath("//input[@type='tel']"));
	txtuser3.sendKeys("8667030513");
	WebElement txtuser4 = driver.findElement(By.xpath("//input[@id='ap_email']"));
	txtuser4.sendKeys("bebbo@gmail.com");
	WebElement txtuser5 = driver.findElement(By.xpath("//input[@id='ap_password']"));
	txtuser5.sendKeys("Ghafbc100");
	
	
	
	}
}
	
	