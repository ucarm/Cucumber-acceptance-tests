Feature: Users should be able to login

@temp
Scenario: User registration
	Given the user is on the login page
	And the user enters a random email
	And the user enters personal information
		|First Name	| Kunka			|
		|Last Name	| Admiral		|
		|City		| Anytown		|
		|Address	| 123 Main St	|
		|Company	| Toyota		|
	