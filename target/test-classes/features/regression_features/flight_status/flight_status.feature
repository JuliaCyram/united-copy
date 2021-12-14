Feature: Flight status


  Scenario: User searches flight status between from and to destinations
    Then click flight status on the main section
    Then fill out leaving from and going to
    Then click search button
    Then verify that user can see new page with flights


  Scenario: Invalid number error message should be displayed when a wrong flight number is entered
    Then click flight status on the main section
    Then enter flight invalid number
    Then verify that user seen error message