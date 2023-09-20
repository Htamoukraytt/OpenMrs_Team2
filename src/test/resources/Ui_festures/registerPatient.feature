Feature: testing functionality of registering patient on Open_mrs application
  Background: same steps for registering a patient
  Given user navigates to the application
    When user provides correct credentials
    Then user chooses the Laboratory location
    And user clicks Login
    And user navigates to the Register a patient page

  Scenario: testing functionality of registering UNKNOWN patient
    When user checks the Unidentified patient box
    Then user chooses the gender from dropdown box and clicks the next step button
    And user clicks the confirm button
    Then user validates patient's firstName and lastName are both UNKNOWN


