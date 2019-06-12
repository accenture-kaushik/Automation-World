$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/kaushikmajumder/git/Automation-World/L001B/src/main/java/com/feature/files/TestNG_Cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "TestNG with Cucumber",
  "description": "",
  "id": "testng-with-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 418552,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "TestNG methods will be run with Cucumber runner",
  "description": "",
  "id": "testng-with-cucumber;testng-methods-will-be-run-with-cucumber-runner",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on logon page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I have entered ID and Password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I will logon to website",
  "keyword": "Then "
});
formatter.match({
  "location": "TestNG_Cucumber.i_am_on_logon_page()"
});
formatter.result({
  "duration": 157254044,
  "status": "passed"
});
formatter.match({
  "location": "TestNG_Cucumber.i_have_entered_ID_and_Password()"
});
formatter.result({
  "duration": 100762,
  "status": "passed"
});
formatter.match({
  "location": "TestNG_Cucumber.i_will_logon_to_website()"
});
formatter.result({
  "duration": 473559,
  "status": "passed"
});
formatter.after({
  "duration": 112373,
  "status": "passed"
});
formatter.after({
  "duration": 67616,
  "status": "passed"
});
});