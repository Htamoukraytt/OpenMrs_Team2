


Feature:  Testing Visit functionality for Unidentified Patient

  Background: navigates register patient

    Given user navigates to the application

    When  user provides correct credentials

    And   user chooses the location 'Laboratory'

    And   user clicks Login

    And  user chooses from home features 'Register a patient'

    Scenario: Validation of Start visit and add Past visit functionalities

    Then user clicks on 'Unidentified Patient' checkbox

    And user select Gender and clicks Next and 'Confirm'

    And user clicks 'Start visit' and 'Confirm'

   Then user validates 'show contact info' button is visible and available

      And user validates 'Merge to another patient' button is visible and available

      And user validates 'Actions' button is visible and available

      And user validates 'End visit' button is visible and available

      And user validates 'Visit notes' button is visible and available

      And user validates 'Admit patient' button is visible and available

      And user validates 'Capture vitals' button is visible and available

      And user validates 'Attachments' button is visible and available

      Then user navigates to 'Actions' and clicks 'Add past visit'

      And user picks date and Confirms

      Then user clicks on Given name of patient

      And clicks 'End Visit'




