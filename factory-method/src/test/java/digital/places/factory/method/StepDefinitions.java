package digital.places.factory.method;

import org.junit.Assert;
import org.junit.rules.ExpectedException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	private Main mobileMain;
//	@Rule
//	public ExpectedException thrown = ExpectedException.none();
	
    @Given("^I have 2 types of phones (.*) and (.*)$")
    public void phoneTypes(String type1, String type2) throws Throwable {
    		Class.forName("digital.places.factory.method."+type1);
    		ExpectedException.none();
    		Class.forName("digital.places.factory.method."+type2);
    		ExpectedException.none();
    }

    @When("^I make an (.*) phone$")
    public void makeApplePhone(String phoneType) throws Throwable {
    	
    	MobilePhone newPhone = (MobilePhone)Class.forName("digital.places.factory.method."+phoneType).newInstance();
		ExpectedException.none();
    	mobileMain = new Main(newPhone);
    }

    @Then("^I should get the output (.*)$")
    public void makeOutputState(String expectedOutput) throws Throwable {
    	String state = mobileMain.printState();
    	System.out.println(state);
    	Assert.assertEquals(expectedOutput, state);
    }

}
