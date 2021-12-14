Feature: Date fields
  As a user I should have departing or return date fields when I choosing different option


  Scenario: Round trip option should have departing and return date fields
    Given click book flight on the main section
    Then click roundtrip in a main section
    Then verify that user seen departing and return date fields


  Scenario: One way option should have only departing
    Given click book flight on the main section
    Then click one way in a main section
    Then verify that user seen departing date field

  Scenario: Checking flexible dates option should change the Dates field to to month and days dropdown
    Given click book flight on the main section
    Then click flexible dates button
    Then verify that change the Dates field to month and days dropdown