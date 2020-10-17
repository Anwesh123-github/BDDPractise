$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/anwes/IdeaProjects/BDDPractise/src/test/Resources/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage Functionality",
  "description": "",
  "id": "homepage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12894340700,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Test calender is clicking or not",
  "description": "",
  "id": "homepage-functionality;test-calender-is-clicking-or-not",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@SouthallCalender"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "User is in the homepage of Southall website",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "User clicks on departure calender",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User should be able to all the dates",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should be able to click on one particular date",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage_SouthallCalender.user_is_in_the_homepage_of_Southall_website()"
});
formatter.result({
  "duration": 89677400,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_SouthallCalender.user_clicks_on_departure_calender()"
});
formatter.result({
  "duration": 122222500,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_SouthallCalender.user_should_be_able_to_all_the_dates()"
});
formatter.result({
  "duration": 46900,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_SouthallCalender.user_should_be_able_to_click_on_one_particular_date()"
});
formatter.result({
  "duration": 10094072500,
  "status": "passed"
});
formatter.after({
  "duration": 12600,
  "status": "passed"
});
});