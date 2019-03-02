/**
 * 
 */
package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;

/**
 * @author Lenovo
 *
 */
public class LoginTest {

	WebDriver driver;
	
	@Test
	public void test(){
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		
		boolean status = page.getLoginCredentials("Admin", "admin123");
		
		System.out.println("Status is:"+status);
		
	}
	
}
