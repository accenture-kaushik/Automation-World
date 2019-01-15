 Feature: Login to Free CRM website

Scenario: Login Test 1

Given User is on Login Page_without Examples Keywprd
When Tile of Login Page contains free CRM_without Examples Keywprd
Then User enters username_without Examples Keywprd uname and password pword
|	naveenk	|	test@123	|
Then User clicks on Login_without Examples Keywprd
Then User moves to Contacts and New Contact_without Examples Keywprd
Then User enter contact details_without Examples Keywprd firstname and lastname and position
|	kaushik	|	Majumder	|	Team Lead	|
Then Close the Browser_without Examples Keywprd



