package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\Arul\\Launch\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	WebElement FirstName=driver.findElement(By.name("firstname"));
	FirstName.sendKeys("Priya");
	WebElement LastName=driver.findElement(By.name("lastname"));
	LastName.sendKeys("thamizh");
	WebElement Male=driver.findElement(By.id("sex-0"));
	Male.click();
	/*WebElement Female=driver.findElement(By.id("sex-1"));
	Female.click();*/
	WebElement Exp=driver.findElement(By.id("exp-2"));
	Exp.click();
	WebElement Date=driver.findElement(By.id("datepicker"));
	Date.click(); 
	WebElement Profession=driver.findElement(By.id("profession-1"));
	Profession.click(); 
	WebElement photo=driver.findElement(By.id("photo"));
	photo.click(); 
	WebElement tool=driver.findElement(By.id("tool-1"));
	tool.click(); 
	WebElement conti=driver.findElement(By.id("continents"));
	conti.click();
	WebElement button=driver.findElement(By.id("submit"));
	button.click();
	}
}
