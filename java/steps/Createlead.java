package steps;
import org.openqa.selenium.By;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createlead extends Baseclass{
	
	@Then("Click the CreateLead button")
   public void Createleadbt() {
	driver.findElement(By.linkText("Create Lead")).click();	}

	@Then("Enter the companyname as {string}")
	public void enter_the_companyname_as_cname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
@Then("Enter the Firstname as {string}")
public void fname(String fname) {

	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
}
@Then ("Enter the LastName as {string}")
public void Lname(String lname)
{
driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
}
@When ("Click the Submit Button")	
public void Submit() {
	driver.findElement(By.name("submitButton")).click();
}	
@Then("Display the view lead page")
public void display_the_view_lead_page() {
		String Title1=driver.getTitle();
		System.out.println(Title1);
	
}
	
	
	
	
   }
	
	
	
	
	
	
	

