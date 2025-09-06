Feature: Swag lab Product Count

  Background:
    Given User is on Login Page
    And wait for 2 seconds
    When User entered Username as "standard_user"
    And wait for 2 seconds
    And User entered Password As "secret_sauce"
    And Click on Login Button
    And wait for 2 seconds

  Scenario: TC1 Login with Valid credentials
        Then User can see 6 products


 Scenario: TC2 verify price of specific product
        Then Price of SaucelabBackPack should be 29.99

  Scenario: TC3 verify price of All product
    Then Price of All Product should be 129.94