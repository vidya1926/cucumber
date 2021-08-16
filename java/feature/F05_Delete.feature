Feature: DeleteLead functionality of LeafTaps

Scenario Outline: Delete the Leads in Application
Given Enter the Username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click the Login button
Then Navigate to Leaftaps Homepage 
When  Click the CRMSFA link
And Click Lead button
And Click the Find Lead
And Click the Phone tab
Given Enter the Phone Number as '99'
When Click the Find Lead
 And select the first lead id
And Click Delete button
And Click the Find Lead
Given Enter the LeadId 
And Click the findLeadbutton
Then Verify that no records found


Examples:
|'phno'|
|'99'|

			
