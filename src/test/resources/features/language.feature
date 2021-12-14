Feature: Language
  As a user I should have option to change language


  Scenario: Change language
    Given click select language button on the home page
    Then click select language
    And choose "Deutsch" language
    Then click change button
    Then verify that language was changed

