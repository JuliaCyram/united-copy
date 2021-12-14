Feature: Check-in Panel


  Scenario: Empty flight check-in form should show error messages when searched without filling up
    Then click check-in on the main section
    Then click continue to check-in button
    Then click continue button on the new check-in page
    Then verify that user seen error message when searched without filling up


  Scenario: There should be a check-in with MilesPlus link and navigates to correct page
    Then click check-in on the main section
    Then click MilesPlus link
    Then verify that after click MilesPlus link user navigates to correct page


  Scenario: There should be a check-in details link and navigates to correct page
    Then click check-in on the main section
    Then click details link
    Then verify that after click link user navigates to correct page



