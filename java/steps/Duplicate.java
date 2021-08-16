package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Duplicate extends Baseclass{
	
/*	@Given("Click the Find Lead")
	public void findLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@And ("Click the Phone tab")
	public void clickphno() 
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Given("Enter the Phone Number as (.*)")
	public void enterphno(String Phno)
	{
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Phno);
	}
		
	@When("select the first lead id")
	public void selectFirstld()
	{
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		}
		*/
	@When("Click the Duplicate Lead")
	public void clickDuplicate()
	{driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@When("Click the submit button")
	public void submitButton()
	{
	driver.findElement(By.name("submitButton")).click();
}
	@Then("Leads get Duplicted")
	public void leads_get_duplicted() 
	    
	{System.out.println("The Lead names are Duplicated");
			

}
}
