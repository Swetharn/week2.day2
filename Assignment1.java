package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Load url "https://acme-test.uipath.com/login"
2. Enter email as "kumar.testleaf@gmail.com"
3. Enter Password as "leaf@12"
4. Click login button
5. Get the title of the page and print
6. Click on Log Out
7. Close the browser (use -driver.close())*/

public class Assignment1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	driver.get("https://acme-test.uipath.com//login//");
	driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println(driver.getTitle());
	driver.close();
}
}
