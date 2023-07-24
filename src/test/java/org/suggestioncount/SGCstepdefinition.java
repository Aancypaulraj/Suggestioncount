package org.suggestioncount;

import java.util.List;

import org.iphoneprice.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SGCstepdefinition  extends BaseClass{
	
	static double flipkartsuggestionscount;
	static double amazonsuggestionscount;
	public static Example E = new Example();
	
	
	@Given("User should be in the google home page")
	public void user_should_be_in_the_google_home_page() {
		browserLaunch();
		urlLaunch("https://www.google.com/search?");
		maximise();
		impWait(10);
	}
	@When("User should input the  {string}")
	public void user_should_input_the(String sitename) throws Exception {
		E = new Example();
		
		sendkeys(E.getGooglesearch(), sitename);
		
		enterPress();
		enterRelease();
	}
	@Then("User should select the available first link")
	public void user_should_select_the_available_first_link() {
		click(E.getFirstlink());
	}
	@Then("Validate the home page and user should enter {string}")
	public void validate_the_home_page_and_user_should_enter(String productname) throws Exception {
		 Thread.sleep(5000);
			
			E = new Example();
			sendkeys(E.getSearch(), productname);
	}
	@Then("User should get the Suggestion count of the product")
	public void user_should_get_the_suggestion_count_of_the_product() throws Exception {
		 E = new Example();
		  
		  if (driver.getCurrentUrl().contains("flipkart")) {
		  List<WebElement> f = driver.findElements(By.xpath("//a[@class='oleBil']"));
		  flipkartsuggestionscount = f.size();
		  }
		  else if(driver.getCurrentUrl().contains("amazon")) {
			  List<WebElement> a = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
			  amazonsuggestionscount = a.size();
			  System.out.println(amazonsuggestionscount);
			  }
		
	}
	@Then("User should quit the browser")
	public void user_should_quit_the_browser() {
	   quit();
	}
	@Then("Compare the Suggestion Count")
	public void compare_the_suggestion_count() {
		if(flipkartsuggestionscount>amazonsuggestionscount) {
			System.out.println("Flipkart has more suggestion count than amazon");
		}
		else 
		System.out.println("Amazon has more suggestion count than flipkart");
	
	}
	}

	
	
//	@Given("User should be in the google home page")
//	public void user_should_be_in_the_google_home_page() {
//		browserLaunch();
//		urlLaunch("https://www.google.com/search?");
//		maximise();
//		impWait(10);
//	}
//	
//	
//	@When("User should input the  {string}")
//	public void user_should_input_the(String sitename) throws Exception {
//		l = new Locators();
//		
//		sendkeys(l.getGooglesearch(), sitename);
//		
//		enterPress();
//		enterRelease();	
//	}
//	
//	
//	@Then("User should select the available first link")
//	public void user_should_select_the_available_first_link() {
//		click(l.getFirstlink());	     
//	}
//	
//	
//	@Then("Validate the home page and user should enter {string}")
//	public void validate_the_home_page_and_user_should_enter(String productname) throws Exception {
//        Thread.sleep(5000);
//		
//		l = new Locators();
//		sendkeys(l.getSearch(), productname);
//	}
//	
//	
//	@Then("User should get the Suggestion count of the product")
//	public void user_should_get_the_suggestion_count_of_the_product() {
//	  l = new Locators();
//	  
//	  if (driver.getCurrentUrl().contains("flipkart")) {
//	  List<WebElement> f = driver.findElements((By) l.getFlipkarsuggestion());
//	  flipkartsuggestionscount = f.size();
//	  }
//	  else if(driver.getCurrentUrl().contains("amazon")) {
//		  List<WebElement> a = driver.findElements((By)l.getAmazonsuggestion());
//		  amazonsuggestionscount = a.size();
//		  }
//	}
//	
//	
//	@And("User should quit the browser")
//	public void user_should_quit_the_browser() {
//	    quit();
//	}
//	
//	
//	@Then("Compare the Suggestion Count")
//	public void compare_the_suggestion_count() {
//		if(flipkartsuggestionscount>amazonsuggestionscount) {
//			System.out.println("Flipkart has more suggestion count than amazon");
//		}
//		else 
//			System.out.println("Amazon has more suggestion count than flipkart");
//		
//	}
//  	}



