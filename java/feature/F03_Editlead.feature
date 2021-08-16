Feature: Edit Lead functionality of LeafTaps
Scenario Outline: Edit the Leads in Application
Given Enter the Username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click the Login button
Then Navigate to Leaftaps Homepage 
When  Click the CRMSFA link
And Click Lead button
And Click the Find Lead
And Click the Phone tab
Given Enter the Phone Number as '99'

When Click the find Leads button
 And select the first lead id
And Click Edit button
Given Enter the Company name as 'CSS'
And Click the submit button 
Then Display the updated cname

Examples:
|'phno'|'cname'|
|'99'|'CSS'|





