Feature: Cryptocurrency Page

@cryptoTest
Scenario: Buy cryptocurrency using the wallet option
Given User is on Buy Cryptocurrency page
When User clicks on buy Cryptocurrency, select currency, choose payment method, enter amount and click confirm 
When User review and confirm 
Then Success message is recieved