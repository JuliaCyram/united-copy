Feature: Leaving and going fields

  As a user I can use leaving from and going fields for different options


  Scenario: Leaving from and going to fields should switch when click on switch icon in the middle
    Given click book flight on the main section
    Then fill_out_leaving_and_going_field "Washington" and "Moscow"
    Then click switch arrows in the middle to switch destination
    Then verify that user seen switch destination


  Scenario: Leaving from and going to fields should have correct placeholders
    Given click book flight on the main section
    Then verify that user seen correct placeholders


  Scenario: User should be able to remove leaving from location value
    Given click book flight on the main section
    Then click leaving from textarea
    Then click remove button in leaving from the textarea
    Then verify that user seen empty leaving from textarea



    Scenario: User should be able to remove going to location value
      Given click book flight on the main section
      Then click going to textarea
      Then enter "Moscow" Flight Destination Input
      Then click remove button in going to  textarea
      Then verify that user seen empty going to textarea