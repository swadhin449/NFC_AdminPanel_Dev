@Movements
Feature: Movements feature
  Scenario: Movement
    Given I  open the chrome browser
    When I  open the fitness court
    And I click on movements
    And I create a category
    And I click on one category
    And I create a movement video
    And I update the movement video
    And I delete the a movement video
    And I update movement category
    Then I delete the category
