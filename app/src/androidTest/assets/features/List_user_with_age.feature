Feature: List User with age display

  Scenario: List user with age
    Given I have these list of users:
      | username  | name      | age |
      | t3ns41    | daori     | 20  |
      | alukito   | andreas   | 22  |
      | kassle    | bruce     | 22  |
    When I touch "t3ns41" from column column 1

