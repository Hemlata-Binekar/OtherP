package TestNG2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(TestListener.class)
public class Assert_Ex1
{
	public WebDriver driver;
	@Test
	public void Kitelaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Practice_Programs\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String ActualTitle = driver.getTitle();
		//Hard Assert or Assert
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		WebElement kitelogo = driver.findElement(By.xpath("//img[contains(@src,'kite-logo')]"));
		Assert.assertTrue(kitelogo.isDisplayed());
		System.out.println("Welcome to TestNg assert");
	}
	
	@Test
	public void Naukrilaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Practice_Programs\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		
		String ExpectedTitle = "Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com";
		String ActualTitle = driver.getTitle();
		//soft Assert or Verify
		SoftAssert SAssert = new SoftAssert();
		SAssert.assertEquals(ActualTitle, ExpectedTitle);
		
		WebElement naukrilogo = driver.findElement(By.xpath("//img[contains(@src,'naukri_Logo')]"));
		SAssert.assertTrue(naukrilogo.isDisplayed());
		System.out.println("Welcome to TestNg assert");
		SAssert.assertAll();
	}

}
