Feature: User Login

 Scenario: Login with invalid mobile number
    Given the user is on the login page
    When the user enters a invalid phone number 
    Then an error message "Invalid mobile number" should be shown

  Scenario: Login with invalid OTP
    Given the user is on the login page
    When the user enters a valid phone number and invalid OTP
    Then an error message "Invalid OTP" should be shown

  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user enters a valid phone number and OTP
    Then the user should be logged in successfully
    And the dashboard should be displayed
    
   



