/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Lenovo
 *
 */
public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='txtUsername']")
	WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(how = How.XPATH, using = "//input[@id='btnLogin']")
	WebElement loginButton;
	
	public boolean getLoginCredentials(String uname, String pass){
		
		username.sendKeys(uname);
		
		password.sendKeys(pass);
		
		loginButton.click();
		
		boolean status = false;
		
		try {
			status= driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
			
		} catch (Exception e) {

            System.out.println("Element not found");
            
            System.out.println(e.getMessage());
			
		}
		
		
		return status;
	}

}
