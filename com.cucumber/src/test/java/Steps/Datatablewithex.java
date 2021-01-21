package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Datatablewithex {
	WebDriver driver;
	
	@Given("^ this is login scenario$")
	public void this_is_login_scenario() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("^user enters \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_and_password(String UserName, String Password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}
	
		@And("^user clicks on the login button site$")
		public void user_clicks_on_the_login_button_site() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("btnLogin")).click();
		}
}
	


