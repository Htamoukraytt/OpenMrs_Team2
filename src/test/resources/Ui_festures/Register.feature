Feature:  Testing Register a patient functionality

  Scenario:  positive Scenario , providing correct data

    Given user navigates to the application

    When  user provides correct credentials

    And   user chooses the location 'Laboratory'

    And   user clicks Login

    And  user chooses from home features 'Register a patient'

    And  user provides correct info   givenName, 'said', FamilyName  , 'souma',

    And  user clicks next

    And  user chooses gender , Male or Female 'M'

    And  user clicks next

    And  user provides birth date , '10' , 'May' , '2001'

    And  user clicks next

    And  user provides address , 'streetAddress' , 'city' , 'il' , 'usa'  , '34234'

    And  user clicks next

    And user provides phone number '35235233523'
      #bug no limit in digits

    And  user clicks next

    And  user clicks next

    And user clicks confirm

   Then user clicks homepage , find patient , search for id and validates the id is unique , 'Showing 1 to 1'









