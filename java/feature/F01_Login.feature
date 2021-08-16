Feature: Login Functionality of Leaftaps
@smoke@sanity
Scenario Outline: 1_Login with positive credentials

Given Enter the Username as <username>
And Enter the password as <password>
When Click the Login button
Then Navigate to Leaftaps Homepage 
When  Click the CRMSFA link
Then  Click Lead button
Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
