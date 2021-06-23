Feature: Login functionality in Leaftaps application

#Background:
#Given open the chrome browser  
#And load the application url  
#And maximize the browser
#And apply wait

@regression
Scenario Outline: TC001_Test login function using positive flow

Given enter the username as <username>
And enter the password as <password>
When click login button
Then Homepage should be displayed

Examples:
|username|password|
|demosalesmanager|crmsfa|
|demoCSR|crmsfa|

@functional @smoke
Scenario: TC002_Test login function using negative flow

Given enter the username as demoCSR
And enter the password as test
When click login button
But Error should be displayed 

