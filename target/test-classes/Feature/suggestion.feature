Feature: Compare the suggestion count for iphone on flipkart and amazon



Scenario Outline: To get the Suggestion count of iphone 

Given User should be in the google home page

When User should input the  "<SiteName>"
Then User should select the available first link
Then Validate the home page and user should enter "iphone"
Then User should get the Suggestion count of the product 
Then User should quit the browser
And Compare the Suggestion Count


Examples:
|SiteName|
|flipkart|
|amazon|
