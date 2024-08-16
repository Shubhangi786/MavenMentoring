package steps;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class CashWithdraw_Step {
	
	    private int accountBalance;
	    private int requestAmount;

	    @Given("I have a balance of ${int} in my account")
	    public void i_have_a_balance_of_in_my_account(int balance) {
	        accountBalance = balance;
	    }

	    @When("I request ${int}")
	    public void i_request(int amount) {
	    	requestAmount = amount;
	    }

	    @Then("${int} should be dispensed")
	    public void should_be_dispensed(int expectedAmount) {
	    	boolean isCashWithdrawn = false;
	        if (accountBalance >= requestAmount) {
	        	isCashWithdrawn = true;
	        }
	        Assert.assertTrue(isCashWithdrawn, "Cash is not dispensed");
	    }
	    
}
