@FitnessCourt
  Feature: Fitness court scenario
    Scenario: Fitness Court
      Given I open the chrome browser
      When I open fitness court
      And I click on create fitness court
      And I enter valid details
      And I click on creat court button
      And I click on one of fitness court check box
      And I delete the account
      And I click on another fitness court check box
      And I add featured workout
      And I click on one fitness court
      And I click on update court
      And I click on row per page
      And I search a fitness court
      And I apply filter with city
      And I apply filter with state
      Then I create the fitness court and confirm in the app

