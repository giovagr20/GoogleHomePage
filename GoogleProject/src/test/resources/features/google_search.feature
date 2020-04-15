# Author: giovannyg32@gmail.com
# Giovanni Gómez Restrepo

Feature: Google Homepage Search

Scenario: User can search with “Google Search”
Given User navigates into homepage
When User types “The name of the wind” into the search field
Then User goes to the search results page
And the first result is “The Name of the Wind - Patrick Rothfuss”
And I go to the “Patrick Rothfuss - The Books” page
