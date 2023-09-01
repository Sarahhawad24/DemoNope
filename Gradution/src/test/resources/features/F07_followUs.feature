Feature: F07

  @Smoke
  Scenario: user click on facebook link
    Given user is in homepage
    And user click on facebook icon
    Then user redirect to facebook account page


    Scenario: user click on twitter icon
      Given user is in homepage
      And user click on twitter icon
      Then user redirect to twitter account page

      Scenario: user click on RSS link
        Given user is in homepage
        And user click on RSS icon
        Then user redirect to RSS account page

        Scenario: user click on youtube icon
          Given user is in homepage
          And user click on youtube icon
          Then user redirect to youtube page