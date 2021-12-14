Feature: Booker container tabs
  As a user I should see that all booker container tabs are display correct fields


  Scenario: All booker container tabs are display correct fields
    Given click book flight on the main section
    And verify that user seen book flight tab
    Then click book hotel on the main section
    And verify that user seen book hotel tab
    Then click book car on the main section
    And verify that user seen book car tab
    Then click book packages on the main section
    And verify that user seen book packages
    Then click book cruise on the main section
    And verify that user seen a new page with cruise
    Then click flight status on the main section
    And verify that user seen flight status tab
    Then click check-in on the main section
    And verify that user seen check-in tab
    Then click my trips on the main section
    And verify that user seen my trips tab
