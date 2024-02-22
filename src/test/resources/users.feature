@User
Feature: Users Scenarios
  Scenario: Users
    Given I open chrome browser
    And I open the fitness court
    When I click on users
    And I select the checkbox and delete one user
    And I click on show
    And I search the user by name
    And I click on date
    And I see all the users
    And I export all user data
    Then I apply the filters
