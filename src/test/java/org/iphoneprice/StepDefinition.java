package org.iphoneprice;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	
	static double f;
	static double a;
	public static Locators l = new Locators();
	
	@Given("User should be in the google home page")
	public void user_should_be_in_the_google_home_page() {
		browserLaunch();
		urlLaunch("https://www.google.com/search?");
		maximise();
		impWait(10);	    
	}

	
	@When("User should input the  {string}")
	public void user_should_input_the(String sitename) throws Exception {
		
		l = new Locators();
			
		sendkeys(l.getGooglesearch(), sitename);
		
		enterPress();
		enterRelease();	    
	}

	
	@Then("User should select the available first link")
	public void user_should_select_the_available_first_link() {
		
		click(l.getFirstlink());	   
	}

	
	@Then("Validate the home page and user should enter the {string}")
	public void validate_the_home_page_and_user_should_enter_the(String productname) throws Exception {
	   
		Thread.sleep(5000);
		
		l = new Locators();
		sendkeys(l.getSearch(), productname);
		
		enterPress();
		enterRelease();
	}

	
	@Then("User should get the price of the product")
	public void user_should_get_the_price_of_the_product() {
		
		if (driver.getCurrentUrl().contains("flipkart")) {
		
			String flipkartPrice = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
			Double f = Double.parseDouble(flipkartPrice.replace("₹", "").replace(",", ""));		
		} 
		else if(driver.getCurrentUrl().contains("amazon")) {
			
			String amazonPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
			Double a = Double.parseDouble(amazonPrice.replace("₹", "").replace(",", ""));
		}		
	}   
	
	
	@Then("User should quit the browser")
	public void user_should_quit_the_browser() {
		
		quit();		
	}

	
	@And("Compare the price list")
	public void compare_the_price_list() {	
		
		if (f>a) {
			System.out.println("FLIPKART PRICE IS GREATER THAN AMAZON PRICE");
		}
		else if (f<a) {
			System.out.println("AMAZON PRICE IS GREATER THAN FLIPKART PRICE");
		}
		else {
			System.out.println("BOTH THE PRICE ARE EQUAL");
		}
		
	
	}



}
	