Feature: Duplicate Lead functionality of LeafTaps
@regression
Scenario Outline: Duplicate the Leads in Application
Given Enter the Username as 'DemoSalesManager'
Given Enter the password as 'crmsfa'
When Click the Login button
Then Navigate to Leaftaps Homepage 
When  Click the CRMSFA link
When  Click Lead button
And Click the Find Lead
And Click the Phone tab
Given Enter the Phone Number as '99'
When Click the find Leads button
And select the first lead id
And Click the Duplicate Lead
And Click the submit button
Then Leads get Duplicted

Examples:
|'phno'|
|'99'|











