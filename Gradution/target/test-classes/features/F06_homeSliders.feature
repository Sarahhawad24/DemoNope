Feature:  F06_homeSliders
  @Smoke
  Scenario: first slider is clickable on home page
    Given user is in homepage
    And user click on first slider in homepage
    Then the page will redirect to nokia page

    Scenario: second slider is clickable on home page
      Given user is in homepage
      And user click on second slider in homepage
      Then the page will redirect to iphone