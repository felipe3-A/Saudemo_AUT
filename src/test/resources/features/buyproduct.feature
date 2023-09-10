Feature: Buy Product
  i need buy one product
  Scenario: Buy Sucessfull
    Given i enter in the page for buy
      |username       |password|
      |standard_user| secret_sauce  |
    When  i select a product and i enter dates
    |name          |surname|zip_code|
    |andres felipe |mamian |Cra.2 #n34|
    Then i recibe my buy