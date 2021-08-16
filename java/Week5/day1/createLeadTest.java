package Week5.day1;

import org.testng.annotations.Test;

public class createLeadTest {
	@Test   
	  public void runleadTest() {
		   System.out.println("runleadTest");
	  }

 @Test(dependsOnMethods= {"week5.day1.createLeadTest.runleadTest"})
  public void duplicateleadTest() {
   System.out.println("duplicateLead");
  }

  @Test(dependsOnMethods= {"week5.day1.createLeadTest.runleadTest"})
  public void editleadTest() {
	   System.out.println("editleadTest");
  }

  
}
