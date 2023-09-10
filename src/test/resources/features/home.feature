Feature: Home
  Scenario: To buy
    Given i enter in the page for buy
      |username       |password|
      |standard_user| secret_sauce|
    When i should select a product
    And i didn't two product
    Then i will Buy



