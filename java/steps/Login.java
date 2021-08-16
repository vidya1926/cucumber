package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends Baseclass{
	
@Given("Enter the Username as {string}")
public void  enterUsernameinp(String uname) {
	 driver.findElement(By.id("username")).sendKeys(uname);
       }

@Given("Enter the password as {string}")
public void enterPassswordinp(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
}

@When("Click the Login button")
public void Submit() 
{
	driver.findElement(By.className("decorativeSubmit")).click();
	}

@Then("Navigate to Leaftaps Homepage") 
public void Homepg() 
{
	String Title=driver.getTitle();
    System.out.println(Title);	 
    if(Title.equals("Leaftaps - TestLeaf Automation Platform"))
    	System.out.println("Homepage is diplayed");

}
@When("Click the CRMSFA link")
public void Crmsfa() {	
	driver.findElement(By.linkText("CRM/SFA")).click();
}
@Then("Click Lead button")
public void click_lead_button() {
	driver.findElement(By.linkText("Leads")).click();
}	

}
