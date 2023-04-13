Feature: Sign-Up Functionality
@SignUp
  Scenario: Sign up with valid credentials
    Given the user is on the W3Schools homepage
    When the user clicks the "Sign Up" button
    And enters valid credentials in the sign-up form
    And clicks the "Submit" button
    #Then the user should be redirected to the "Thank You" page

  #Scenario: Sign up with invalid email
    #Given the user is on the W3Schools homepage
    #When the user clicks the "Sign Up" button
    #And enters invalid email in the sign-up form
    #And clicks the "Submit" button
    #Then the sign-up form should display an error message for invalid email
#
  #Scenario: Sign up with missing required fields
    #Given the user is on the W3Schools homepage
    #When the user clicks the "Sign Up" button
    #And leaves one or more required fields blank in the sign-up form
    #And clicks the "Submit" button
    #Then the sign-up form should display an error message for missing required fields
#
  #Scenario: Sign up with existing email
    #Given the user is on the W3Schools homepage
    #When the user clicks the "Sign Up" button
    #And enters an email that is already registered in the sign-up form
    #And clicks the "Submit" button
    #Then the sign-up form should display an error message for existing email
