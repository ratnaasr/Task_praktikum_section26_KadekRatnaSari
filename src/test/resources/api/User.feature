Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: GET - As admin I have be able to get detail user
    Given I set GET api endpoints
    When I send GET HTPP request
    Then I receive valid HTTP response code
    And I receive valid data for detail user