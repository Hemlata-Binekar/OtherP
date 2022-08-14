package TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailLogin {
	public WebDriver driver;
	@Test(dataProviderClass=TestNG2.dpGmail.class,dataProvider = "Gmaildata")
	public void LoginGM(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		//Login Gmail 
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='identifierId']"));
		WebElement Nxt1 = driver.findElement(By.xpath("//span[text()='Next']"));
		Username.sendKeys(username);
		Nxt1.click();
		Thread.sleep(5000);
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement Nxt2 = driver.findElement(By.xpath("//span[text()='Next']"));
		Password.sendKeys(password);
		Nxt2.click();
		
		
		
		
		
	}

}
