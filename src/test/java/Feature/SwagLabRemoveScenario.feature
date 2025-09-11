

Feature: Order Prduct
  Background:
    Given User is on Login Page
    When User entered Username as "standard_user"
    And wait for 2 seconds
    And User entered Password As "secret_sauce"
    And Click on Login Button
    And wait for 2 seconds

  Scenario: remove bike light
    And user click on add to cart option for the product sauce labs backpack
    And wait for 2 seconds
    And user click on add to cart option for the product sauce labs bike light
    And wait for 2 seconds
    And Click on add to cart option
    And wait for 2 seconds
    And remove sauce labs backpack
    And wait for 2 seconds
    And User click on Checkout button
    And wait for 2 seconds
    And user enter first name as "pallavi"
    And wait for 2 seconds
    And User enter password as "gfgdgd"
    And wait for 2 seconds
    And user enter pincode as 11213
    And wait for 2 seconds
    And user click on continue button
    And wait for 2 seconds
    And user click on finish button
    And wait for 2 seconds
    Then order place message should be visible "Thank you for your order!"
    And wait for 2 seconds