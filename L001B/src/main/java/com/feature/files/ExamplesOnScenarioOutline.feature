Feature: Login to Free CRM website

Scenario Outline: Login Test 2

Given User is on Login Page
When Tile of Login Page contains free CRM
Then User enters username "<uname>" and password "<pword>"
Then User clicks on Login
Then User moves to Contacts and New Contact
Then User enter contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the Browser


Examples:
|	uname	|	pword	|	firstname	|	lastname	|	position |
|	naveenk	|	test@123|	kaushik		|	majumder	|	Team Lead |
|	admin	|	admin	|	prateek		|	asthana		|	Team Lead|