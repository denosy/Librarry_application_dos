Feature: Google Search Functionality

  @smoke
  Scenario: Search page default title verification
    When user is in the Google search page
    Then user should see the title is Google