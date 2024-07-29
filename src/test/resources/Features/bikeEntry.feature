Feature: Bike Entry

@smoke
Scenario: To verify that we are able to search register bike numbers
Given user enters valid bike number as "AP37DT1228"
When user clicks on search on view prices 
Then user is able to see the info of that bike