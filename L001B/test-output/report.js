$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/kaushikmajumder/git/Automation-World/L001B/src/main/java/com/feature/files/Simple.feature");
formatter.feature({
  "line": 1,
  "name": "This is a simple scenario used for reporting",
  "description": "",
  "id": "this-is-a-simple-scenario-used-for-reporting",
  "keyword": "Feature"
});
formatter.before({
  "duration": 329367,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Printing logs",
  "description": "",
  "id": "this-is-a-simple-scenario-used-for-reporting;printing-logs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have testing report",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I have to print custom report",
  "keyword": "Then "
});
formatter.match({
  "location": "SimpleStepDef_Reporting.i_have_testing_report()"
});
formatter.result({
  "duration": 141436197,
  "status": "passed"
});
formatter.match({
  "location": "SimpleStepDef_Reporting.i_have_to_print_custom_report()"
});
formatter.result({
  "duration": 461122,
  "status": "passed"
});
formatter.after({
  "duration": 83331,
  "status": "passed"
});
formatter.after({
  "duration": 62799,
  "status": "passed"
});
formatter.before({
  "duration": 168218,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Launching google and taking screen shot",
  "description": "",
  "id": "this-is-a-simple-scenario-used-for-reporting;launching-google-and-taking-screen-shot",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Launch Google",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "validate that google is launch correct",
  "keyword": "Then "
});
formatter.match({
  "location": "SimpleStepDef_Reporting.launch_Google()"
});
formatter.result({
  "duration": 3824051783,
  "status": "passed"
});
formatter.match({
  "location": "SimpleStepDef_Reporting.validate_that_google_is_launch_correct()"
});
formatter.result({
  "duration": 10185566,
  "status": "passed"
});
formatter.after({
  "duration": 107417,
  "status": "passed"
});
formatter.after({
  "duration": 70057,
  "status": "passed"
});
});