Feature: My trips panel


  Scenario: There should be a link to find United Travel Credits page
    Then click my trips on the main section
    Then verify that section have ink to find United Travel Credits page


  Scenario: Empty My Trips form should show error messages when searched without filling up
    Then click my trips on the main section
    Then click search button
    Then verify that user see error messages when searched without filling up


  Scenario: There should be a link to find my trips sign in page
    Then click my trips on the main section
    Then verify that user have link to find my trips sign in page