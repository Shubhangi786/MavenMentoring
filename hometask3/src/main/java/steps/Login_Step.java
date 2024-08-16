package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step {

	    @Given("the user is on the login page")
	    public void the_user_is_on_the_login_page() {
	        System.out.println("User is on the login page");
	    }

	    @When("the user enters valid credentials")
	    public void the_user_enters_valid_credentials() {
	        System.out.println("User enters valid credentials");
	    }

	    @Then("the user should be redirected to the homepage")
	    public void the_user_should_be_redirected_to_the_homepage() {
	        System.out.println("User is redirected to the homepage");
	    }
	

}
