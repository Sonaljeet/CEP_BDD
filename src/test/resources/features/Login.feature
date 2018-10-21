@default 
Feature: Login Functionality 

Scenario: Validate Login Functionality for CEP Application 
	Given user is on Home Page of CEP Application 
	When user enters username and password 
	And user clicks on login button 
	Then home page should get loaded