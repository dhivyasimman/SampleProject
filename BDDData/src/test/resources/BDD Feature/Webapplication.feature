Feature: Virtual Stock Exchange Function
Scenario: Login to VSE
      Given User Logs into the VSE website
      When  User inputs the valid username and password
      Then User verifies the title DASHBOARD  

Scenario: Buy trades for Order type Market
      Given User selects TRADE STOCKS option in MAKE A TRADE dropdown 
      When User selects the Region, Location and keys in necessary values
      And Clicks the Preview Button
      Then Now User Clicks the Confirm Button
      And Trade is successfully placed
   
Scenario: Logout of VSE
      Given User is in the VSE website
      When Click Logout
      Then User verifies the Virtual Stock Exchange title 