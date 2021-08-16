Feature: MergeLead functionality for leaftaps
@smoke
Scenario: Merge the Lead in Leaftaps application
Given Enter the Username as 'DemoSalesManager'
And   Enter the password as 'crmsfa'
When  Click the Login button
Then   Navigate to Leaftaps Homepage 
When   Click the CRMSFA link
Then    Click Lead button
When    Select the Merge Lead
Given   LeadId in Fromlead box
Then 	Move to Second window
Given   Enter the FirName as 'Hari'
Then    Click the FindLead
When    select the first lead id
Then    Back to firstWindow
Given   LeadId in Tolead box
Then     Navigate to findlead window
Given   Enter the FirstName as 'Ganesh'
Then    Click the FindLead
Then    select the first lead id
When    Click MergeLeads
And     Click the Find Lead
Given   Enter the LeadId 
And     Click the findLeadbutton
Then    Verify that no records found

