Feature: Feature to test Signup Page

  Scenario: Check signup page is successful with valid credentials
    Given User is on signup page
    When user fills up signup page
    Then signUp is a success and closes bowser
