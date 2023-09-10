Feature: Login
  i need login
  Scenario: Login Succesfull
    Given i enter in the page
    When i enter credentials
    |username       |password|
    |standard_user| secret_sauce  |
    Then i will be login

    Scenario: Login Incorrect
      Given i enter in the page
      When i enter wrong credentials
        |username|password|
        |usuario1| 12345  |
      Then i will not be login