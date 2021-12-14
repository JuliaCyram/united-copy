Feature: Packages

  Scenario: User should see vacation search result with all fields filled properly
    Then click book packages on the main section
    Then fill out package form
    Then verify that user seen vacation search


  Scenario: Vacation form should have only up to 4 rooms
    Then click book packages on the main section
    Then verify that room option have only 4 rooms


  Scenario: Rooms container should say “rooms” if room count is bigger than one
    Then click book packages on the main section
    Then click 2 rooms option on the package panel
    Then verify that user seen "rooms" on the packages