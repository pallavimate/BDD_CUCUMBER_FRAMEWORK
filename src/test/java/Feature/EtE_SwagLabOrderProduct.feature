
#EtE_SwagLabOrderProduct
Feature: Order Prduct
Background:


And wait for 2 seconds
When User entered Username as "standard_user"
And wait for 2 seconds
And User entered Password As "secret_sauce"
And Click on Login Button
And wait for 2 seconds

  Scenario: Order place EtE
    And user click on add to cart option for the product sauce labs backpack
    And Click on add to cart option
    And User click on Checkout button
    And user enter first name as "pallavi"
    And User enter password as "gfgdgd"
    And user enter pincode as 11213
    And user click on continue button
    And user click on finish button
    Then order place message should be visible "Thank you for your order!"
