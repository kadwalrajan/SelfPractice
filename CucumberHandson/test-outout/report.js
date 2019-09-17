$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("closeBrowser.feature");
formatter.feature({
  "line": 1,
  "name": "Close the browser",
  "description": "",
  "id": "close-the-browser",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Close browser when done",
  "description": "",
  "id": "close-the-browser;close-browser-when-done",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CloseBrowserStepDefinition.close_the_Browser()"
});
formatter.result({
  "duration": 179015807,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on Google Search Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Google_Search_Page()"
});
formatter.result({
  "duration": 190893,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user what is the capital of Canada in the search page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_what_is_the_capital_of_Canada_in_the_search_page()"
});
formatter.result({
  "duration": 144367,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 167288,
  "status": "passed"
});
});