Feature:  Testing Register a patient functionality and UNKNOWN patient

  Background: navigates register patient

    Given user navigates to the application

    When  user provides correct credentials

    And   user chooses the location 'Laboratory'

    And   user clicks Login

    And  user chooses from home features 'Register a patient'



  Scenario:  positive Scenario , providing correct data

    And  user provides correct info   givenName, 'said', FamilyName  , 'souma',

    And  user clicks next

    And  user chooses gender , Male or Female 'M'

    And  user clicks next

    And  user provides birth date , '10' , 'May' , '2001'

    And  user clicks next

    And  user provides address , 'streetAddress' , 'city' , 'il' , 'usa'  , '34234'
     #bug wrong date
    And  user clicks next

    And user provides phone number '35235233523'
      #bug no limit in digits
    And  user clicks next

    And  user clicks next

    And user clicks confirm

    Then user clicks homepage , find patient , search for id and validates the id is unique , 'Showing 1 to 1'




  Scenario: Testing functionality of registering UNKNOWN patient on Open_mrs application

    When user checks the Unidentified patient box

    And  user chooses gender , Male or Female 'F'

    And  user clicks next

    And user clicks confirm

    Then user validates patients firstName and lastName are both UNKNOWN , 'UNKNOWN' , 'UNKNOWN'





    Scenario: negative Testing of  registering a patient with missing required info

      And  user provides correct info   givenName, '       ', FamilyName  , '       ',
   # bug fields for given name and family  can take anything as input (numbers symbols )
      And  user clicks next

      Then user validate expected error message , 'Required' , 'Required'