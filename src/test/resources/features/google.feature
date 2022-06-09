Feature: Test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google page
    When user enters text in search bar
    And clicks on search button
    Then user is navigated to search results page
