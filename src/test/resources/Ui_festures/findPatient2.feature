Feature: Testing the search functionality of the website

  @smoke
  Scenario: Search Bar Functionality for Open MRS website

    Given user navigates to the application

    When  user provides correct credentials

    And   user chooses the location 'Laboratory'

    And   user clicks Login

    And  user chooses from home features 'Find Patient Record'

    And  user provides the id '100MMW'

    Then user validates the id is unique , 'Showing 1 to 1'





