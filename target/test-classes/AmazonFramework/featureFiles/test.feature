Feature: user should be able to login to sandbox

@Smoke
Scenario Outline: User should be able to login to salesforce using chrome
	Given User navigates to "<desired website>"
	When User enters login credentials "<username>" and "<password>"
	And Clicks on login button
	Then He should be able to enter the application
	
	Examples:
		|desired website|username|password|
		|https://test.salesforce.com|sakesh|sake|
		|https://test.salesforce.com|sakesh|sadineni|
		
	