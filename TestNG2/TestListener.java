package TestNG2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListener implements ITestListener{
  @Override
	public void onTestStart(ITestResult result) {
	  System.out.println("on Test Start method started"+result.getName());
  }

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test method Success"+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test method Failure"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("on test method Skipped"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test method Failed But within Success Percentage"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on test method Failed with Timeout"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start method Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on Finish method Finished");
	}

@Test
  public void FailedM() {
	Assert.assertTrue(False);

  }
}
