import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("beforeSuite");

	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("beforeTest");

	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");

	}

	@Test
	public void testscript1() {
		
		System.out.println("Testcase 1");

	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("AfterMethod");

	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("AfterClass");

	}

	@AfterTest
	public void afterTest() {

		System.out.println("AfterTest");
	}
	
	@AfterSuite
	private void afterSuite() {
		
		System.out.println("AfterSuite");

	}
}
