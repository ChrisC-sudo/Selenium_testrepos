package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.SearchGooglePage;

public class GoogleSearch_test{
	
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
	GoogleSearch();
}
	public static void GoogleSearch() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "/Users/User/Downloads/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		SearchGooglePage.textbox(driver).sendKeys("Iphone");
		SearchGooglePage.button(driver).click();
		driver.close();
		System.out.println("Successful");
	
	}
	

}
