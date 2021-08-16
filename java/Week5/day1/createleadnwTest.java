package Week5.day1;

import org.testng.annotations.Test;

public class createleadnwTest {

  @Test(priority=1)
  public void deleteleadTest() {
    System.out.println("Deletelead");
  }

  @Test(dependsOnGroups="editleadTest")
  public void duplicateleadTest() {
	    System.out.println("Deletelead");
  }

  @Test(dependsOnGroups="duplicateleadTest")
  public void editleadTest() {
	    System.out.println("duplicatelead");
  }

  @Test(priority=5)
  public void postConditionTest() {
	    System.out.println("postcondition satisfied");
  }

  @Test(invocationCount=3)
  public void preConditionTest() {
	    System.out.println("precondition satisfied");
  }

  @Test
  public void runleadTest() {
	    System.out.println("run testlead");
  }

  @Test
  public void sendDataTest() {
	    System.out.println("senddata");
  }

  @Test
  public void setfileTest1() {
	    System.out.println("setfile");
  }

  @Test
  public void setfileTest() {
	    System.out.println("setfile");
  }
}
