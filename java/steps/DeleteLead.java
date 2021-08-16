package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteLead extends Baseclass{
	
  @Given("Click Delete button")
   public void clickDelete() {
	driver.findElement(By.linkText("Delete")).click();
     }
/*	@And("Click the Find Lead")
	public void clickfind() {
		driver.findElement(By.linkText("Find Leads")).click();
	  }*/
	@Given("Enter the LeadId")
	public void leadId() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@And("Click the findLeadbutton")
	public void selectfindld() {
	
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Verify that no records found")
	public void noRecordsfound()
	{
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
	
	}
	

}
