package Steps;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class Dtwh {
		WebDriver driver;
		@Given("^your enter the open hrm site$")
		public void your_enter_the_open_hrm_site() throws Throwable {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");	 
		}
		@When("^you enter the valid data$")
		public void you_enter_the_valid_data(DataTable datatable) throws Throwable {
			// Write code here that turns the phrase above into concrete actions
			// For automatic transformation, change DataTable to one of
			// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
			// E,K,V must be a scalar (String, Integer, Date, enum etc)
			List<Map<String,String>>step=datatable.asMaps(String.class, String.class);
			String user=step.get(0).get("UserName");
			String pass=step.get(0).get("Password");
			driver.findElement(By.id("txtUsername")).sendKeys(user);
			driver.findElement(By.id("txtPassword")).sendKeys(pass);

		}
		@And("^your clicks on the login button$")
		public void your_clicks_on_the_login_button() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("btnLogin")).click();
		}
		@Then("^you should be go to home page$")
		public void you_should_be_go_to_home_page() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
			boolean status1=driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
			Assert.assertTrue(status1);
		}
	}



