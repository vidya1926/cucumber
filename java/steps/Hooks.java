package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Baseclass{
	@Before
public void preCondition() {
	
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	}	
		@After
	public void postCondition() {
		driver.close();
	}	
	}
