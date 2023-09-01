Feature:  F01_Register
  @Smoke
  Scenario: guest user could register with valid data successfully
    Given user is in homepage
    And user click on register link button
    And user select gender type
    And user enter firstname
    And user enter lastname
    And user enter date of birth
    And user enter email
    And user enter password
    And user confirm password
    And user click on register button
    Then success message is displayed