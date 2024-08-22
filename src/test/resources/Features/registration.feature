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
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

 Feature: To verify that functionalities of the registration page
 Scenario:To verify  that user is able to enter valid first name
 Given user able to enter valid first name field
 Then the first name field should be accepted 
 And user able to enter valid address field
 Then the address field should be accepted
 And user able to select dropdown list in state
 Then the state field should be selected
 And user able to enter valid phone number
 Then the field should be accepted
 When click on send otp button
 Then the send otp is sucessfull and otp fields should be displayed
 And user able to enter valid otp 
 When click on otp button
 Then otp field should be accepted and navigated to the next field
 And user able to enter valid gmail
 Then the field should be accepted 
 When click on send otp button
 Then the send otp is sucessfull and otp fields should be displayed
 And user able to enter valid otp
 When click on otp button
 Then the otp field should be accepted and navigated to the next field
 And user able to click on call us button
 Then it display the one phone number in call us button below
 And user able to click on register button
 Then it is navigated to the qutation page