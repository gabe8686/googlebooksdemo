$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/googlebooks.feature");
formatter.feature({
  "line": 2,
  "name": "Google Books Search",
  "description": "",
  "id": "google-books-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.before({
  "duration": 2068715881,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the google books page is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepDefinition.the_login_page_is_loaded()"
});
formatter.result({
  "duration": 859264868,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User able to retrieve search results",
  "description": "",
  "id": "google-books-search;user-able-to-retrieve-search-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user performs a search for \"shark\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I set the number of books to 5 books",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click update",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "each result listing should contain \"shark\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "shark",
      "offset": 32
    }
  ],
  "location": "HomePageSteps.the_user_performs_a_search_for(String)"
});
formatter.result({
  "duration": 166670442,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 29
    }
  ],
  "location": "HomePageSteps.i_set_the_number_of_books_to_books(String)"
});
formatter.result({
  "duration": 158665020,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.i_click_update()"
});
formatter.result({
  "duration": 5090894147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shark",
      "offset": 36
    }
  ],
  "location": "HomePageSteps.each_result_listing_should_contain(String)"
});
formatter.result({
  "duration": 34120754,
  "status": "passed"
});
formatter.after({
  "duration": 568314228,
  "status": "passed"
});
});