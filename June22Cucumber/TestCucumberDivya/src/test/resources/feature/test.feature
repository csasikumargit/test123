#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Adactin Hotel


@login, @Regression

  Scenario: Login Functionality
    Given Load the URL
    And Provide the User ID and Passowrd
    And Click the Submit Option 
    #Then Validate the Page

@BookingHistory, @Regression
  Scenario: Login Functionality
    Given Load the URL 
    And Provide the User ID and Passowrd
    And Click the Submit Option 
    And Click the booking history
    
    
    @BookingHistoryData
    
    Scenario: Booking History
    
    Given Load the URL "https://adactinhotelapp.com/"
    And Provide the User ID "csasikumarmes" and Passowrd "sqr403"
    And Click the Submit Option 
    And Click the booking history
    
    
    @endtoend
    
    Scenario: End to End
    
    Given Load the URL
    And Test
    And test project git
    
    
    @login
    
    Scenario: test validation
    Given Load the url and data
    

    

