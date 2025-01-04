Feature: Google Search

  Scenario: Finding some cheese
  Given I am on the Google search page
  When I search for "Cheese!"
  Then the page title should start with "cheese"
  
  
 #ctrl+click
  #Scenario Outline: Find Cucumber on google with Ex
    #Given I am on the Google search page
    #When I search for "<keyword>"
    #Then I validate the page title should contain "<keyword>"
#
    #Examples: 
      #| keyword  |
      #| Selenium |
      #| Postman  |
