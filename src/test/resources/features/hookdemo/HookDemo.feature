Feature: check user login functionality

  Scenario: user lands on login page
    Given user opens login screen
    When user enters name and password
    And user clicks login btn
    Then user navigated to home screen
