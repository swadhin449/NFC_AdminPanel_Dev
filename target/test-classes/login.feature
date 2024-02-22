@Login
Feature: Login Scenarios
  Scenario Outline: Login with valid credential
    Given User launch the chrome browser
    When User open the Admin panel
    And I enter the valid email as "<email>"
    And I enter the password as "<pass>"
    Then I click on login
    Examples:
      |  | email                         | pass      |  |
      |  | akshaydafade@peppersquare.com | Reset$123 |  |


