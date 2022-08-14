package TestNG2;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional_Ex1 
{
	@Test
	@Parameters("msg")
	public void opt1(@Optional("This is optional method") String msg)
	{
		System.out.println(msg);
	}
	
	@Test
	@Parameters({"val1","val2"})
	public void opt2(@Optional("10") int v1,@Optional("20") int v2) 
	{
		int diff = v2-v1;
		System.out.println("diff is"+diff);
		
	}
}
