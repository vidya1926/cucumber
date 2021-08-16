Feature: Create Lead functionality for leaftaps
@smoke@Regresion
Scenario Outline: CreateLead in Leaftaps application
Given Enter the Username as 'DemoSalesManager'
And   Enter the password as 'crmsfa'
When  Click the Login button
Then   Navigate to Leaftaps Homepage 
When   Click the CRMSFA link
Then   Click Lead button
Then   Click the CreateLead button
Then   Enter the companyname as <cname>
Then   Enter the Firstname as <fname>
Then   Enter the LastName as <lname>
When  Click the Submit Button
Then  Display the view lead page


Examples:
|cname|fname|lname|
|'TL'|'Karthik'|'M'|
|'CSS'|'Vijay'|'R'|
