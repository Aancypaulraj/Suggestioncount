package org.iphoneprice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends BaseClass {
	
	public Locators() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getGooglesearch() {
		return googlesearch;
	}

	public void setGooglesearch(WebElement googlesearch) {
		this.googlesearch = googlesearch;
	}

	public WebElement getFirstlink() {
		return firstlink;
	}

	public void setFirstlink(WebElement firstlink) {
		this.firstlink = firstlink;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getFlipkartprice() {
		return Flipkartprice;
	}

	public void setFlipkartprice(WebElement flipkartprice) {
		Flipkartprice = flipkartprice;
	}

	public WebElement getAmazonprice() {
		return Amazonprice;
	}

	public void setAmazonprice(WebElement amazonprice) {
		Amazonprice = amazonprice;
	}

	@FindBy (id = "APjFqb")
	private WebElement googlesearch;
	
	@FindBy (xpath = "//h3[@class='LC20lb MBeuO DKV0Md']")
	private WebElement firstlink;
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement search;
	
	@FindBy (xpath = "(//div[@class='_30jeq3 _1_WHN1'])[1]")
	private WebElement Flipkartprice;
	
	@FindBy (xpath = "(//span[@class='a-price-whole'])[1]")
	private WebElement Amazonprice;

}
