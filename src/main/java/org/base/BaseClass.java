package org.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected static WebDriver driver;
	WebDriverWait wait;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

	}
	
	public void get(String string)
	{
		driver.get(string);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static String sendKeys(WebElement w, String value) {

	//	WebElement uname = driver.findElement(By.name(String));
		w.sendKeys(value);
		return value;
	}

	public static void loginBtn(WebElement w) {
		//driver.findElement(By.name(name)).click();
		w.click();

	}

	public void submitBtn(String name) {
		driver.findElement(By.name(name)).click();

	}
	public void RegBtn(String string)
	{
		driver.findElement(By.xpath(string)).click();
		
	}
	public void tearDown() {
		driver.quit();

	}
	
	public void dropDown(String String, String value)
	{
		WebElement e1 = driver.findElement(By.name(String));
		Select s = new Select(e1);
		s.selectByValue(value);
		
	}
	
	public static void getPropertySend(WebElement w, String key) throws IOException
	{
		Properties p = new Properties();
		
		FileReader f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		
		p.load(f);
		
		p.getProperty(key);
		w.sendKeys(p.getProperty(key));
//		System.out.println(p.getProperty(key));
		
	}
	
	
	public void test()
	{
		System.out.println("TEST");
		System.out.println("TEST");
		System.out.println("TEST");
		System.out.println("TEST");
		System.out.println("TEST");
	}
	

}
