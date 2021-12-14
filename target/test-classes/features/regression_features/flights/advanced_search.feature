Feature: Advanced search

  As a user I can open a separate page with more advanced search fields when I click advance search


  Scenario: Advance search should open a separate page with more advanced search fields
    Given click book flight on the main section
    Then click advanced search
    Then verify that after click open a separate page with more advanced search fields