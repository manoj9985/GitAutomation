
@tag
Feature: Purchase the order from Ecommerce Website
  I want to use this template for my feature file

	Background: //this executes before each scenario
	Given I landed on Ecommerce Page


  @tag2
  Scenario Outline: Positive Test of Submitting the order
    Given Logged in with Username <name> and Password <password> 
    When I added product <ProductName> to the cart 
    And Checkout <ProductName> and submit the order
    Then "THANKYOU FOR THE ORDER." message id displayed in confirmation page

    Examples: 
      | name  								| password         | ProductName |
      | rahulshetty@gmail.com |  IamKing@0000 	 | ZARA COAT 3 |
 