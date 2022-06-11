Feature: check raghav login functionality

  Background: 
    Given raghav opens login screen
    When raghav enters name and password
    And raghav clicks login btn

  Scenario: raghav lands on login page
    Given raghav is on home screen
    When raghav clicks login btn
    Then raghav navigated to home screen
