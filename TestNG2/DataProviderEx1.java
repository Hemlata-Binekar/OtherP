package TestNG2;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderEx1 {
	public WebDriver driver;
  @Test(dataProvider = "naukri")
  public void LoginNaukri(String username, String password) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
	  // For Opening Login Page
	  WebElement LGClck = driver.findElement(By.xpath("//div[text()='Login']"));
	  LGClck.click();
	
	  //For Entering Login Info
	  WebElement Username = driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active')]"));
	  WebElement Password = driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
	  Username.sendKeys(username);
	  Password.sendKeys(password);
	  LoginBtn.click();
	  
  }

  @DataProvider
  public Object[][] naukri() {
    return new Object[][] {
      new Object[] {" hbinekar45@gmail.com", "1234667" }, //Login Credential
      new Object[] { "hbinekar@gmail.com", "124679" },
    };
  }
}
