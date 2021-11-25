import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/User/Downloads/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}	
	@Test
	public void SearchProd() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		Search sea = new Search();
		sea.launchBrowser();
		sea.SearchProd();
	}
	
}