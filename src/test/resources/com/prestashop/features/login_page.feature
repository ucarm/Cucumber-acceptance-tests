@login 
Feature: login 

@smoke  @all
Scenario: login link 
	When the user is on the home page 
	When the user clicks on the Sign in link 
	Then username and password fields should be displayed 
@all
Scenario: verfiy suer name and last name 
	Given the user is on the login page 
	When I login using username "nitoyey@dumoac.net" and password "password" 
	Then user's full name "John" "Smith" should be on displayed

@amazon_check @all
Scenario: verfiy goes to different site first
	Given the user amazon
	And user gets prices for "Printed Chiffon Dress"
	When the user is on the home page
	Then the price for "Printed Chiffon Dress" should be cheaper