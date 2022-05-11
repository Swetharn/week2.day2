package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		/*
		 * //Pseudo Code 1. Launch URL "http://leaftaps.com/opentaps/control/login" 2.
		 * Enter UserName and Password Using Id Locator 3. Click on Login Button using
		 * Class Locator 4. Click on CRM/SFA Link 5. Click on Leads Button 6. Click on
		 * create Lead Button 7. Enter CompanyName using id Locator 8. Enter FirstName
		 * using id Locator 9. Enter LastName using id Locator 10. Click on create Lead
		 * Button Using name Locator 11. Get the Title of the resulting Page 12.close
		 * the browser
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Atos");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}