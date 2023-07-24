package org.iphoneprice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	
	//This method is used for launching browser
	public static void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	public static void urlLaunch(String url) {
		
		driver.get(url);

	}
	
	public static void maximise() {
		
		driver.manage().window().maximize();

	}
	
	public static void impWait(long a) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}
	
	public static void sendkeys(WebElement a, String b ) {
		
		a.sendKeys(b);

	}
	
	public static void click(WebElement a) {
		
		a.click();

	}
	
	public static void enterPress() throws Exception {
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
		
    public static void enterRelease() throws Exception {
		
		Robot r = new Robot();
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
    
    public static void quit() {

    	driver.quit();
	}

}
