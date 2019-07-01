package scenarioOutline;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class calc {
	
	@Given("Enter {int} in the calculator")
	public void firstvalue(int num)
	{
		System.out.println("Entered first value:"+num+"");
	}
	
	@And("Press {word} button")
	public void clickAdd(String key)
	{
		System.out.println("Pressed "+key+" button");
	}
	
	@And("Enter {int} in the calculator again")
	public void secondvalue(int num)
	{
		System.out.println("Entered second value:"+num+"");
	}
	
	@When("press equal button")
	public void clickequal()
	{
		System.out.println("Pressed the equal button");
	}
	
	@Then("The result should be {int} on this screen")
	public void result(int num)
	{
		System.out.println("Result showned as "+num+"");
	}
	
	
}

