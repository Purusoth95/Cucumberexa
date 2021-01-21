package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginDefinition {
	WebDriver driver;
	
	@Given("^user enter the open hrm site$")
	public void user_enter_the_open_hrm_site() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@When("^user enter the valid username and password$")
	public void user_enter_the_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	}

	@And("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();	   
	}
	@Then("^the user should be navigate to home page$")
	public void the_user_should_be_navigate_to_home_page() throws Throwable {
		boolean status=driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
	   Assert.assertTrue(status);
	   
	}


}
