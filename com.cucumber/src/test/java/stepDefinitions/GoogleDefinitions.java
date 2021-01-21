package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleDefinitions {
	
	WebDriver driver;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("^User is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchTerm) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(searchTerm);	
	    }
	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^the user should see the search result$")
	public void the_user_should_see_the_search_result() throws Throwable {
	   Boolean status= driver.findElement(By.partialLinkText("agni")).isDisplayed();
	    if(status) {
	    	System.out.println("results displayed");
	    }
	    else{
	    	System.out.println("not working");
	    }
	}


}
