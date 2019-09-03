Feature: HealthCare

Scenario: Title and Text on page
Given user is on 'HealthCare' page
When page is loaded
Then check if title of the page is 'HealthCare management'
And check if there is a text 'Enquiry Details Form'

Scenario: Empty first name
Given user is on 'HealthCare' page
When user no data is entered in first name
Then the alert box displays 'First Name must be filled out'

Scenario: Empty last name
Given user is on 'HealthCare' page
When user no data is entered in last name
Then the alert box displays 'Last Name must be filled out'

Scenario: Enter Email and Mobile
Given user is on 'HealthCare' page
When enteres email
And character data entered in the Mobile textbox
Then the alert box displays the message 'Enter numeric value'

Scenario: Invalid mobile number
Given user is on 'HealthCare' page
When invalid data entered in the Mobile text box
Then the alert box displays the message 'Enter 10 digit Mobile number'

Scenario: Select type of healthCare required
Given user is on 'HealthCare' page
When select Type of healthCare required as 'Basic Physican'
And select Mode of Treatment as 'Homepathic'
And submit the request button
Then Verify the alert box displays message 'Enquiry details must be filled out'

Scenario: Valid enquiry details
Given user is on 'HealthCare' page
When user enters valid enquiry details
Then Verify the message 'Thank you for submitting the healthCare Enquiry'
And Click OK
And Verify the text 'Our Counselor will contact you soon' after submission of form
And Close the browser window
