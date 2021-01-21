package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Regularex {
	
	@Given("^I have (\\d+) laptop$")
	public void i_have_laptop(int num) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is "+num);
	   
	}

	@When("^I have (\\d+\\.\\d+) CGPA$")
	public void i_have_CGPA(float num) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("CGPA is"+num);
	   
	}

	@Given("^\"(.*?)\" is elder than \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_than_and(String Name, String Name2, String Name3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(Name + "is elder" + Name2 + " and "+ Name3);
	    
	}

}
