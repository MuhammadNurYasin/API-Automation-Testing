@reqresin
Feature: Reqresin

  @del-user @positive
  Scenario: success DEL users
    When user send "DEL" request to reqresin url
    Then user input valid id
    Then response should be 204
    And response structure should match json schema

  @del-user @negative
  Scenario: failed DEL users
    When user send "DEL" request to reqresin url
    Then user input invalid id
    Then response should be 404
    And response structure should match json schema

  @get-singleUser @positive
  Scenario: success GET single users
    When user send "GET" request to reqresin url
    Then user input valid id
    Then response should be 200
    And response structure should match json schema

  @get-singleUser @negative
  Scenario: failed GET single users
    When user send "GET" request to reqresin url
    Then user input invalid id
    Then response should be 404
    And response structure should match json schema

  @get-singleUser @negative
  Scenario: failed GET single users with id set to character
    When user send "GET" request to reqresin url
    Then user input id with character
    Then response should be 404
    And response structure should match json schema

  @get-singleUser @negative
  Scenario: failed GET single users with id set to special character
    When user send "GET" request to reqresin url
    Then user input id with special character
    Then response should be 404
    And response structure should match json schema

  @get-singleUser @negative
  Scenario: failed GET single users with id set to string
    When user send "GET" request to reqresin url
    Then user input id with string
    Then response should be 404
    And response structure should match json schema