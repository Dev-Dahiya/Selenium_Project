Feature: Login
Scenario: Successful login with valid credentials
Given user is on Home Page
When User enters valid username and password
And User clicks Go button
Then User can visit Practice page
And A message is displayed
