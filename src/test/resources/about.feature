@About
Feature: About Feature
  Scenario: About
    Given I  open the Chrome browser
    When I  open the Fitness court
    And I click on About
    And I create a sponsor
    And I update a sponsor
    And I delete the sponsor
    And I click on User health stats
    Then I click on users steps and calories
