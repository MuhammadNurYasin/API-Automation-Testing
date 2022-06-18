@reqresin
Feature: Reqres API

  @get-list-resource @positive
  Scenario: success GET list resource
    When user send GET list resource
    Then response status code should be 200
    And response body should be equal with jsonSchema "list-resource.json"

  @get-single-list-resource @positive
  Scenario: success GET single list resource
    When user send GET single list resource
    Then response status code should be 200
    And response body should be equal with jsonSchema "list-single-resource.json"

  @post-login @positive
  Scenario: success POST login
    When user send POST login request with body "success-login.json"
    Then response status code should be 200
    And response body should be equal with jsonSchema "login.json"

  @post-login @negative
  Scenario: failed POST login
    When user send POST login request with body "failed-login.json"
    Then response status code should be 400
    And response body should be equal with jsonSchema "unsuccessful-login.json"

  @post-register @positive
  Scenario: success POST register
    When user send POST register request with body "success-register.json"
    Then response status code should be 200
    And response body should be equal with jsonSchema "register.json"

  @post-register @negative
  Scenario: failed POST register
    When user send POST register request with body "failed-register.json"
    Then response status code should be 400
    And response body should be equal with jsonSchema "unsuccessful-register.json"

  @post-create-user @positive
  Scenario: success POST create user
    When user send POST create request with body "success-create-user.json"
    Then response status code should be 201
    And response body should be equal with jsonSchema "create-user.json"

  @put-update-user @positive
  Scenario: success PUT update user
    When user send PUT update request with body "success-update-user.json"
    Then response status code should be 200
    And response body should be equal with jsonSchema "update-user.json"

  @del-user @positive
  Scenario: success DEL delete user
    When user send DEL request to delete user by id
    Then response status code should be 204



