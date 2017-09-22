
package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class Test1 {

  private final String s;

  public Test1(String s) {
    this.s = s;
  }

  @Parameterized.Parameters(name = "{index}: {0}")
  public static Object[][] data() {
	  return new Object[][]{
		  { "s1" },
		  { "s2" }
	  };
  }

  @Test
  public void test() {
    System.out.println("Running Test for '" + s +"'...");
    assertFalse(s.isEmpty());
  }

}
