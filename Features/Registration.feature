Feature: As a business user i need to verify the following 
Dev team should develop the registration feature in 3 sections
QA team must validate 3 section headers and their respective fields
Dev team should write a business logic to register multiple users with different sets of data
QA team must validate each and every input field

@Launch
Scenario: This scenario is designed to validate section headers
    Given As an user i want to launch "ff" browser and pass the url and maximize it
    |http://demo.nopcommerce.com/|  
    
    When Application is launched click on register link
    Then Verify Register page is launched successfully
    #And Verify section headers are displayed as expected
    
@Random1    
Scenario: This scenario is designed to validate section headers
    Given As an user i want to launch Firefox browser and maximize it
    When Application is launched click on register link
    Then Verify Register page is 432 successfully
    
@Random2    
Scenario: This scenario is designed to validate section headers
    Given As an user i want to launch Firefox browser and maximize it
    When Application is launched click on register link
    Then Verify Register page is 645645 successfully