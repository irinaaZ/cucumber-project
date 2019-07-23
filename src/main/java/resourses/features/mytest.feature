@TestScenario
Feature: Cart logic

  Scenario: Adding the product into a cart
    Given Configure browser
    And open home page
    And search the word "Blouse" in search field
    And turn page into a list view
    Then add product into a cart
    And checking the presence of product in a cart
    Then close the browser