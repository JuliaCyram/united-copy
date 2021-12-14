Feature: Travelers
  As a user I can add and delete traveler count up as much as I want


  Scenario: User should be able to increment traveler count up to 9
    Given click book flight on the main section
    Then click travelers selector
    Then choose travelers 9 adults
    Then verify that user seen 9 travelers


  Scenario: User can select one traveler from every single passenger type
    Given click book flight on the main section
    Then click travelers selector
    Then select one traveler from every single passenger type
    Then verify that user seen 1 for every single passenger type


  Scenario: Minimum one traveler should be selected
    Given click book flight on the main section
    Then click travelers selector
    Then verify that user seen 1 traveler


  Scenario: User can only travel with one pet
    Given click book flight on the main section
    Then click travelers selector
    Then click travel with pet
    Then verify that user can choose only one pet