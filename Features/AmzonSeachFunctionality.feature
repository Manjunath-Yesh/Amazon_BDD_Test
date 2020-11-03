Feature: Search and Buy an Item

@sanity
Scenario Outline: Successful Login with Valid Credentials 
	Given User Launch Amazon Mobile App and select on "Already a customer? Sign in" Already a customer? Sign in Option
	And User Enter the Email as "<email>"
	And User clicks on "Continue" Continue button
	And User Enter Password as "<password>" and clicks on "Sign In" Sign In Button
	And User is Landed to Amazon Home page
	And User Entered the search as "<search_item>" 
	Then User should select the Items Randomly
	And User should able to buy the selected Item "<SearchIndex>"
	
	
	Examples:
	|email|password|search_item|SearchIndex|
	|manjunathqa21@gmail.com|$ER$4er4|samsung mobile phones|3|