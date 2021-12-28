Feature: Login to account at webdriveruniversity.com using login portal

Scenario Outline: Login to account with a valid password
	Given I access webdriveruniversity.com
	When I click on login portal
	And I enter a user name
		| sakesh | sadineni|
	And I enter a valid password
	When I click on login button
	Then I should be presented with a succesful validation alert
		