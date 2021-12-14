Feature: Flight classes

  As a user I can select different flight classes such as Economy, Premium economy, Business or First

  Scenario: select flight Premium economy class
    Given click book flight on the main section
    Then select Premium economy class
    Then verify that user choose Premium economy class

  Scenario: select flight Business or First class
    Given click book flight on the main section
    Then select Business or First class
    Then verify that user choose Business or First class

  Scenario: select flight Economy class
    Given click book flight on the main section
    Then select Economy class
    Then verify that user choose Economy class