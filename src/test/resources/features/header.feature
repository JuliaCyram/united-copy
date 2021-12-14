Feature: Header tabs

  As a user when I clicked top header tabs should show correct panels


  Scenario: All top header tabs should show correct panels
    Given click book tab on the header
    Then verify that user seen correct book panel
    Then click my trips tab on the header
    Then verify that user seen correct my trips panel
    Then click travel info tab in the header
    Then verify that user seen correct travel info panel
    Then click MILEAGEPLUS PROGRAM tab in the header
    Then verify that user seen correct MILEAGEPLUS PROGRAM panel
    Then click deals tab on the header
    Then verify that user seen correct deals panel
    Then click help tab on the header
    Then verify that user seen correct help panel


