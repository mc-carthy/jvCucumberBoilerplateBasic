Feature: Login Feature
  This feature deals with the login functionality of the application

  Scenario: Login with valid credentials
    Given I navigate to the login page
    When I enter the username as "admin" and password as "adminpassword"
    And I click the login button
    Then I should the userform page