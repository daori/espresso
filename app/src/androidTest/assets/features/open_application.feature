Feature: Open application and click button login

  Scenario: Open application and click button login
    Given I open application
    And I input text on username "daori"
    And I input text on password "password"
    And I adding additional value
    When I click button login
    Then I should see label with "daori" text