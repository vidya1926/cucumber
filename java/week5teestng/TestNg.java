package week5teestng;

import org.testng.Assert;
import org.testng.annotations.Test;

import Analyzer.RetryFailedTests;


public class TestNg {
  @Test(retryAnalyzer=RetryFailedTests.class)
  public void f() {
	 String a="Vidya";
			 String b="vidya 1";
	  Assert.assertEquals(a,b);
	  
  }
}
