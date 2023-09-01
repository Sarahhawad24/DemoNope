Feature:  F02_Login
  @Smoke
  Scenario: user could login with valid email and password
    Given user is in homepage
    And user click on loginlink button
    Then user redirect to the login page
    And user enter email
    And user enter password
    And user click on login button
    Then user login to the system successfully



    Scenario: user could login with invalid email and password
      And user click on loginlink button
      Then user redirect to the login page
      And user enter unvalid email
      And user enter password
      And user click on login button
      Then an error message will appeare

