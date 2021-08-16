package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class MergeLead extends Baseclass {
	@When("Select the Merge Lead")
	public void selectMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();

	}
	
	@Given ("LeadId in Fromlead box")
	public void fromlead() {
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	
	@Then ("Move to Second window")
	public void windowHandle()  {
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}	

	@Given("Enter the FirName as {string}")
	public void enter_the_fir_name_as_fname(String fname) throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
    Thread.sleep(2000);
	}
	
	@Then("Click the FindLead")
	public void click_the_find_lead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}  
	
	@Then("Back to firstWindow")
	public void backTowindow()
	{Set<String> allWindows1= driver.getWindowHandles();
	List<String> allhandles1 = new ArrayList<String>(allWindows1);
	driver.switchTo().window(allhandles1.get(0)); 		
		}
			
	@Given("LeadId in Tolead box")
	public void entertoLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}	
	
	@Then("Navigate to findlead window")
	public void findLeadwindow()
	{
		Set<String> allWindows2= driver.getWindowHandles();
	List<String> allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(0));		
	}
	
	@Given ("Enter the FirstName as {string}")
	public void entername(String fnam) {
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fnam);
	//	Thread.sleep(2000);
		Set<String> allWindows3= driver.getWindowHandles();
		List<String> allhandles3= new ArrayList<String>(allWindows3);
		driver.switchTo().window(allhandles3.get(1));
	}
	
	//@Then    Click the Find Lead
	//Then    Click the FirstLeadId
	
	@When("Click MergeLeads")
	public void mergeLeads()
	{	Set<String> allWindows4= driver.getWindowHandles();
	List<String> allhandles4= new ArrayList<String>(allWindows4);
	driver.switchTo().window(allhandles4.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();
	}
}
