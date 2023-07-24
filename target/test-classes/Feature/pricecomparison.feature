Feature: Compare iphone 12 price on flipkart and amazon



Scenario Outline: To get the price of iphone 

Given User should be in the google home page

When User should input the  "<SiteName>"
Then User should select the available first link
Then Validate the home page and user should enter the "<productname>"
Then User should get the price of the product 
Then User should quit the browser
And Compare the price list


Examples:
|SiteName|productname|
|flipakart|iphone12 white|
|amazon|iphone12 white|
