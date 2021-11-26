package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.SearchGooglePage;

public class GoogleSearch_test{
	
	static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception{
	GoogleSearch();
}
	public static void GoogleSearch() throws InterruptedException, Exception {
		
		FileInputStream file =  new FileInputStream("C:/Users/User/Documents/MyFirstProject/My_SELProject/src/test/java/test/Config.properties");
		Properties prop =  new Properties();
		prop.load(file);
		String driverpath= prop.getProperty("driverpath");
		String url = prop.getProperty("url");
		
		System.setProperty("webdriver.chrome.driver", "driverpath");
		driver = new ChromeDriver();
		driver.get("url");
		System.out.println(driverpath);
		System.out.println(url);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		SearchGooglePage.textbox(driver).sendKeys("Iphone");
		SearchGooglePage.button(driver).click();
		driver.close();
		System.out.println("Successful");
	
	}
	

}
