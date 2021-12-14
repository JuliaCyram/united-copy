Feature: Searches for trip
  As a user I should see available flights are displayed when I searched


  Scenario: Searches for roundtrip basic economy ticket
    Given click roundtrip in a main section
    Then enter "Moscow" Flight Destination Input
    Then enter depart date
    Then enter date return date
    Then click "Find flights" button
    Then verify that user seen available flights are displayed


  Scenario: Searches out one way flight ticket for the date of Jan 15, 2022
    Given click one way in a main section
    Then enter "Moscow" Flight Destination Input
    Then enter depart date "Jan 15, 2022"
    Then click "Find flights" button
    Then verify that user seen available flights are displayed


    Scenario: Searches out roundtrip flight tickets: 2 adults, 1 infant for the date of Feb 15, 2022
      Given click roundtrip in a main section
      Then enter "Moscow" Flight Destination Input
      Then enter depart date
      Then enter date return date
      Then choose travelers:{int} adults, {int} infant
      Then click "Find flights" button
      Then verify that user seen available flights are displayed