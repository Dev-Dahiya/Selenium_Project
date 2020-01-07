Feature: Login
Scenario: Successful login with Valid Credentials
Given User is on Home Page
When User enter valid User Name and Password
Then User see a greeting message

Scenario: Successful Logout
Given User is logged in
When User logs out
Then User should not see greeting message
