Feature: A customer purchases products

  Scenario: Calculate bill amount
    Given A customer purchased some products
      | Soap    |  50 |
      | Shampoo | 450 |
    When Customer bills the amount for products
    Then The bill to be paid is 500
