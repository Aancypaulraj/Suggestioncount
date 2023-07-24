package org.suggestioncount;

import org.iphoneprice.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example extends BaseClass {
	
	public Example() {
		
		PageFactory.initElements(driver, this);
		
	}
	

	public WebElement getGooglesearch() {
		return googlesearch;
	}

	public WebElement getFirstlink() {
		return firstlink;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getFlipkarsuggestion() {
		return Flipkarsuggestion;
	}

	public WebElement getAmazonsuggestion() {
		return Amazonsuggestion;
	}


	@FindBy (id = "APjFqb")
	private WebElement googlesearch;
	
	@FindBy (xpath = "//h3[@class='LC20lb MBeuO DKV0Md']")
	private WebElement firstlink;
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement search;
	
	@FindBy (xpath = "//a[@class='oleBil']")
	private WebElement Flipkarsuggestion;
	
	@FindBy (xpath = "//div[@class='s-suggestion s-suggestion-ellipsis-direction']")
	private WebElement Amazonsuggestion;

}
