package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {
	WebDriver driver;
	@Given("^user enter the open hrm sites$")
	public void user_enter_the_open_hrm_sites() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("^user enter the valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_valid_credentials_and(String username, String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}
	@And("^user clicks on the login button site$")
	public void user_clicks_on_the_login_button_site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^the user should be navigate to home page site$")
	public void the_user_should_be_navigate_to_home_page_site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean status=driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
		Assert.assertTrue(status);

	}


}
