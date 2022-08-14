package TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFlipKart 
{
	public WebDriver driver;
  @Test(priority = 1)
  public void LaunchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Practice_Programs\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.Flipkart.com");
	  driver.manage().window().maximize();
	  
  }
   
  @Test(priority = 2)
  public void CheckTitle() 
  {
	  String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  
  }
  
  @Test(priority = 3)
  public void Login()
  {
	  WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	  WebElement  password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	  
	  username.sendKeys("7709353569");
	  password.sendKeys("jiyu@2321");
	  loginBtn.click();
  }
  
  @Test(priority = 4)
  public void TopOffers()
  {
	  WebElement topOffers = driver.findElement(By.xpath("//div[text()='Top Offers']"));
	  topOffers.click();
  }
  
 /* @Test(priority = 5)
  public void Rakhigift()
  {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  WebElement Rakhigift = driver.findElement(By.xpath("//div[text()='Rakhi Gift Sets']"));
	  js.executeScript("arguments[0].click", Rakhigift);
  }   */
  

  



}
