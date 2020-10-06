Feature: Application Login

@WebTest
Scenario: Home page default login
Given User is on YellowCard landing page
When User login into application with username and password
When User enters otp
Then Home page is populated


@WebTest
Scenario: Buy cryptocurrency using the wallet option
When User clicks on buy Cryptocurrency, select currency, choose payment method, enter amount and click confirm 
Then Success message is recieved

@WebTest
Scenario: Sell cryptocurrency using the wallet option
When User clicks on sell Cryptocurrency and successfully sell
Then Success message is recieved







