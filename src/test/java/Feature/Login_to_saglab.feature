    Feature: Login Dunctionality

      Background:

        Given User is on Login Page

      Scenario: TC1 Login with Valid credentials
        And wait for 2 seconds
        When User entered Username as "standard_user"
        And wait for 2 seconds
        And User entered Password As "secret_sauce"
         And Click on Login Button
          And wait for 2 seconds
       Then HomePage will be Visible with logo text "Swag Labs"


#        Scenario: TC2 Login with invalid credentials
#          And wait for 2 seconds
#          When User entered Username as "standard_user"
#          And wait for 2 seconds
#          And User entered Password As "secret_sauce1"
#          And Click on Login Button
#         And wait for 2 seconds
#          And error msg will displayed msg "Epic sadface: Username and password do not match any user in this service"