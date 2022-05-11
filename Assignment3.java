package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("https://www.opencart.com/index.php?route=account/register");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("swetha_rn");
driver.findElement(By.name("firstname")).sendKeys("Swetha");
driver.findElement(By.name("lastname")).sendKeys("Rajendran");
driver.findElement(By.name("email")).sendKeys("swetha09rajendran@gmail.com");
driver.findElement(By.name("country_id")).sendKeys("Afghanistan");
driver.findElement(By.name("password")).sendKeys("Swetha09@");
driver.findElement(By.xpath("//button[text()='Register'][2]")).click();
	}

}
