Feature: F03_currencies
  @Smoke
  Scenario: user select currience
    Given user is in homepage
    And user select euro Currencies
Then the website change all price to Euro