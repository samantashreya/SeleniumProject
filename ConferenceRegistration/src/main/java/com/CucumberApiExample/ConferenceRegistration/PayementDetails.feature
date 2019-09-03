
@PayementDetailsTesting
Feature: Checking the payment Details are filled with valid credentials
Scenario:
         Check the Payment Details of the process
         Given browser is now opened after clicking it
         And User is logged into the page
         When I enter the below details and makepayement
          |Fields|Values|
          |Cardholdername|polo|
          |debitcardnumber|123454|
          |cardexpirationmonth|february|
          |cardexpirationyear|2020|
          Then Page with paymment done is displayed
        
    