package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		/*
		 * //Pseudo Code 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"	
		 * 2. Enter UserName and Password Using Id Locator
		 * 3. Click on Login Button using Class Locator
		 * 4. Click on CRM/SFA Link
		 * 5. Click on Accounts Button
		 * 6. Click on Create Account
		 * 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		 * 8. Enter DEscriptiion as "Selenium Automation Tester"
		 * 9. Enter LocalName Field Using Xpath Locator
		 * 10. Enter SiteName Field Using Xpath Locator
		 * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as
		 * Attribute
		 * 14. Click on Create Account using Xpath Locator 15.Close the browser
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();	
		 driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.xpath("//a[text()='Accounts']")).click();
			driver.findElement(By.xpath("//a[text()='Create Account']")).click();	
			driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("TN");
			driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
			driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("1234542");
			driver.findElement(By.xpath("//input[@value='Create Account']")).click();
			

	}

}