
Feature: TESTING LOGIN FUNCTIONALITY


  Scenario Outline: Testing happy path login with all locations feature
    Given user navigates to the application

    When  user provides correct credentials

    And   user chooses the location '<LOCATION>'

    And   user clicks Login

    Then  user validates login was successfully '<LoggedIn_Location>'

    Examples:
      | LOCATION          | LoggedIn_Location                                     |
      | Laboratory        | Logged in as Super User (admin) at Laboratory.        |
      | Inpatient Ward    | Logged in as Super User (admin) at Inpatient Ward.    |
      | Isolation Ward    | Logged in as Super User (admin) at Isolation Ward.    |
      | Outpatient Clinic | Logged in as Super User (admin) at Outpatient Clinic. |
      | Pharmacy          | Logged in as Super User (admin) at Pharmacy.          |
      | Registration Desk | Logged in as Super User (admin) at Registration Desk. |


  Scenario Outline:  Testing negative login scenario

    Given user navigates to the application

    When user provides wrong credentials '<userName>' , '<password>'

    And  user chooses the location '<LOCATION>'

    And  user clicks Login

    Then  user validates the login was not successfully 'Invalid username/password. Please try again.'
    Examples:
      | userName | password | LOCATION          |
      | wrong    | 42343423 | Laboratory        |
      |          | Admin123 | Inpatient Ward    |
      | admin    |          | Isolation Ward    |
      |          |          | Outpatient Clinic |
      | admin    | Admin12  | Pharmacy          |
      | 12476    | %&%&^^   | Registration Desk |