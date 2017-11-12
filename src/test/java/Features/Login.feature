Feature: Login Feature
  This feature deals with the login functionality of the application

  Scenario: Login with valid credentials
    Given I navigate to the login page
    When I enter the following credentials for login
      | username | password        |
      | "admin"  | "adminPassword" |
    And I click the login button
    Then I should the userform page