Feature: Book adding function of user10


  Scenario: User adding new book
    Given User is on the main page Book Management - User click button Books on the left top
    And User click Add Book button
    Then User entering book name, iSBN, Year, Author, Book category, Description
    And User click Save Changes Button
    Then User should see a pop-up window "The book has been created."
