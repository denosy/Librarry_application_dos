Feature: Login function of user10

  @smoke
  Scenario: User is logging with valid credentials
      Given user is on the login page
      And user should enter valid login and password
      Then user should see name on profile "Test Librarian 10"
