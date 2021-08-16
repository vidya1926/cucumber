package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Editlead extends Baseclass
{  	
	@Given ("Click the Find Lead")
	public void findLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
		@And ("Click the Phone tab")
	public void clickphno() 
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}	
	@Given("Enter the Phone Number as {string}")
	public void enter_the_phone_number_as_phno(String Phno) {
	    
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Phno);
	}
		@When("Click the find Leads button")
	public void click_the_find_leads_button()
	{    
		
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
			@And("select the first lead id")
	public void selectFirstld() throws InterruptedException
	{ 
		Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();		
   }
	@And ("Click Edit button")
	public void clickEdit() 
	{
		driver.findElement(By.linkText("Edit")).click();
	}			
	@Given("Enter the Company name as {string}")
		public void cname(String cname)
	{	
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
	}	
	@And("Click the submit button and display the page title")
	public void click_the_submit_button_and_display_the_page_title() {
	   
	driver.findElement(By.name("submitButton")).click();
	}
	@Then("Display the updated cname")
	public void updatedcname() {		
	String t=driver.getTitle();
	System.out.println(t);
	System.out.println("Company name updated");
	}
}
