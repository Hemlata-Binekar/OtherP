package TestNG2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterMul1 {
  @Test
  @Parameters({"val1", "val2"})
  public void Mul(int v1, int v2)
  {
	  int mul = v1 * v2;
	  System.out.println("Multiplication is="+mul);
  }
}
