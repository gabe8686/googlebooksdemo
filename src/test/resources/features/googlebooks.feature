@search
Feature: Google Books Search

  Background:
    Given the google books page is loaded

  Scenario: User able to retrieve search results
    When the user performs a search for "shark"
    And I set the number of books to 5 books
    And I click update
    Then each result listing should contain "shark"