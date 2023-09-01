Feature:F08_Wishlist
  @Smoke
  Scenario: 1
    Given user is in homepage
    And user click on this product HTC
    Then user will see the success message appear

    Scenario: 2
      Given user is in homepage
      And click on WishListLink