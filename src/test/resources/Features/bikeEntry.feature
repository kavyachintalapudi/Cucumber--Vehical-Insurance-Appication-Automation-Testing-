@validbikenumber

Feature: Bike Entry

Scenario: To verify that user is  able to search the details
Given user should click on vehicle insurance module button
Then user is able to navigate the bike entry page
 
 @validbikenumber
Scenario: valid bike details 
Given user enter valid bike number 
When user click on view prices button
Then user is able to navigate the registration page

@invalidBikeNumber

Scenario: To verify that  user is enter invalid bike number
Given user enter invalid bike number 
When user click on view prices button
Then user is able to see error message at bike number text box field


@callusbutton

Scenario: To verify that the user is able to click on call us button
Given user click on call us button
Then user can able to view the call number


@Loginhyperlink
Scenario: To verify that user is able to click on login hyperlink
Given user click on login hyperlink
Then user is able to navigate the login page


