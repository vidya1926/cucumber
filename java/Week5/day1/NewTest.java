package Week5.day1;

import org.testng.annotations.Test;

public class NewTest {

  @Test(priority=1,invocationCount=2)
  public void deleteleadTest() {
System.out.println("deletelead");  }
  
  
  @Test(dependsOnMethods="mergeleadTest")
  public void duplicateleadTest() {
System.out.println("duplicatelead");  }

  @Test
  public void mergeleadTest() {
System.out.println("mergelead");  }
}
