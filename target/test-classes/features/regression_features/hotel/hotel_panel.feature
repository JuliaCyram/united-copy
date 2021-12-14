Feature: Hotel Panel
  As a user I can see on a Hotel panel following fields: Going to, check-in, check-out, number of rooms, number of travelers,book with miles and find hotels button


  Scenario: Hotel panel following fields: Going to, check-in, check-out, number of rooms, number of travelers,book with miles and find hotels button
    Then click book hotel on the main section
    Then verify that user can see Going to, check-in, check-out, number of rooms, number of travelers,book with miles and find hotels button fields


  Scenario: One room and 1 travelers should be selected by default
    Then click book hotel on the main section
    Then verify that One room and one travelers selected by default


  Scenario: User can select maximum 8 adult and 8 children travelers, 16 in total
    Then click book hotel on the main section
    Then click number of travelers field
    Then click adult plus button 8 times
    And click children plus button 8 times
    Then verify that in total 16 travelers


  Scenario: User should be able to maximum 8 rooms
    Then click book hotel on the main section
    Then click hotel room field
    Then select maximum 8 rooms
    Then verify that user seen 8 rooms

  Scenario: Number of travelers field should disappear when number of rooms is more than one


  Scenario: User should see result when finding for a hotel with all the form fields filled properly
    Then click book hotel on the main section
    Then fill out hotel panel form
    Then verify that user seen hotel search with result