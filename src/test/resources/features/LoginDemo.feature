Feature: Test login functionalty

  Scenario Outline: check login is succesful
    Given broswer is open by user
    And user opens login page
    When enter <userName> and <password>
    And user clicks on login button
    Then user is navigated to home

    Examples: 
      | userName | password |
      | Raghav   |    12345 |
      | Tanvi    |    12345 |
