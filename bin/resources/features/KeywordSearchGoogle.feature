Feature: As a normal user I should be able to search on Google 

Scenario Outline: Searching a keyword on Google
  Given I am on the Google search page "https://www.google.com/"
	And I search keywords "<searchKeywords>" from google search
	Then I click on first available link containing same keyword
	Then logo appuears of the page loaded
		
 	Examples:
	 | searchKeywords |
	 | J. P. Morgan  |

  
   
