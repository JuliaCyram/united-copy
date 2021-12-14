Feature: Car Panel

  As a user I can see Cars panel following fields: Pickup location, Drop off location, Pickup time, Drop offtime, return car to same location, primary driver is 25 or older, book with miles, find cars

  Scenario: Cars panel following fields: Pickup location, Drop off location, Pickup time, Drop offtime, return car to same location, primary driver is 25 or older, book with miles, find cars
    Then click book car on the main section
    Then verify that user can see all fields on a Car panel are located


  Scenario: Drop off location should disappear if return car to same location checkbox is checked
    Then click book car on the main section
    Then click return car to same location checkbox
    Then verify that drop off location disappear


  Scenario: Age field should disappear if primary driver is 25 or older checkbox is checked
    Then click book car on the main section
    Then verify that age field disappear


  Scenario: Finding a car after filling up the form should navigate to a separate tab
    Then click book car on the main section
    Then fill out car panel form
    Then verify that user navigate to a separate tab


    Scenario: Searching for a rental car with an age lesser than 21 should display @some error message"
      Then click book car on the main section
      Then fill out car panel form
      Then add an age lesser than 21
      Then verify that user seen "Some car rental suppliers do not rent to young drivers"
