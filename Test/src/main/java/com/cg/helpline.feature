@helplineCheck
Feature: Verifying the functionality of JobsWorld Page

Background: Hitting all the wrong inputs and checking output of alert box
Given Start the browser
And navigating to website

@titleCheck
Scenario: Checking Title of page
When site loads
Then title should be RegistrationForm.html  


@userIdCheck
Scenario: Checking User Id input functionality
When I submit empty userid
Then alert box should display error

@passCheck
Scenario: Checking Password input functionality
When I submit empty password
Then password alert box should display error

@nameCheck
Scenario: Checking Name input functionality
When I submit empty name
Then name alert box should display error

@addressCheck
Scenario: Checking Address input functionality
When I submit empty address
Then address alert box should display error

@countryCheck
Scenario: Checking Country input functionality
When I submit empty country
Then country alert box should display error

@zipCheck
Scenario: Checking ZIP input functionality
When I submit empty zip
Then zip alert box should display error

@emailCheck
Scenario: Checking Email input functionality
When I submit empty email
Then email alert box should display error

@genderCheck
Scenario: Checking Gender input functionality
When I submit empty gender
Then gender alert box should display error

@allCheck
Scenario: Checking All Input functionalities together
When I submit all valid input
Then Success alert box should appear
