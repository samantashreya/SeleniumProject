
@PersonalDetailsTest
Feature:
          Conference Registration Form  testing with Valid Credentials
          by filling the form
Scenario: Check  Personal Details of Conference Registration process
          Given browser is now  has opened
          And User is logged-in  into the application
          When I enter below details and Click Next
          |Fields|Values|
          |FirstName|Polo|
          |LastName|SMITH|
          |Email|xyz@gmail.com|
          |Contactno|987654321|
          |People|1|
          |Address|airoli|
          |Area|az|
          |State|hjj|
          |type|conference|
          Then A page with Payment Details is Opened
          


                    
                    
                    
          
                    
                    
                    
          
                    
          
                           
                 
                 
                 