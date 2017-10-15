import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


public class CheckSuccessfulLogin{
	WebDriver driver;
	@BeforeMethod
	 public void beforeMethod(){
	
	System.setProperty("WebDriver.Chrome.ChromeDriver","C:\\Users\\Asus PC\\Desktop\\Eclipse Neon and Selenium");
	driver=new ChromeDriver();
	}
	@Test
	public void login() throws InterruptedException
	{
		driver.navigate().to("https://www.chilis.com/");
	}
	
}
