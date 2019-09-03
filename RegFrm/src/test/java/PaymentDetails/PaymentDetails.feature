
Feature: Payment Details

Scenario: Invalid Card Holder Name
Given user is on 'Payment Detail' page
When user enters invalid Card Holder Name
Then displays 'Please fill the Card Holder Name'

Scenario: Invalid Debit Card Number
Given user is on 'Payment Detail' page
When user enters invalid Debit Card Number
Then displays 'Please fill Debit Card Number'

Scenario: CVV Not entered
Given user is on 'Payment Detail' page
When user does not enter CVV value
Then displays 'Please fill CVV Number'

Scenario: Invalid Card Expiration Month
Given user is on 'Payment Detail' page
When user enters invalid Expiration Month
Then displays 'Please fill Expiration Month'
  
Scenario: Invalid Card Expiration Year
Given user is on 'Payment Detail' page
When user enters invalid Expiration Year
Then displays 'Please fill Expiration Year'

Scenario: Valid Payment Details
Given user is on 'Payment Detail' page
When user enters valid Payment Details
Then displays 'Congrats...!!!' 