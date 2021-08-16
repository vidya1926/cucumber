package week5teestng;

import org.testng.annotations.Test;

public class NewTestTest {

  @Test
  public void afterClassTest() {
	  
    System.out.println("afterclassTest");
  }

  @Test
  public void afterSuiteTest() {
	  System.out.println("aftersuiteTest");  }

  @Test
  public void beforeClassTest() {
	  System.out.println("beforeclassTest");  }

  @Test
  public void beforeTestTest() {
	  System.out.println("beforetestTest");  }
}
