 # Author: giovannyg32@gmail.com
 # Giovanni Gómez Restrepo

Feature: Google Homepage Search


Scenario: User can search by using the suggestions
Given User navigates into homepage google
When User types The name of the w into the search field
And the suggestions list is displayed
Then User goes to the search result pages
And the first result is The Name of the Wind by Patrick Rothfuss
And User goes to the web Patrick Rothfuss The Books page