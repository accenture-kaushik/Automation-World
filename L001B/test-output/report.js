$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/kaushikmajumder/git/Automation-World/L001B/src/main/java/com/feature/files/Simple.feature");
formatter.feature({
  "line": 1,
  "name": "This is a simple scenario used for reporting",
  "description": "",
  "id": "this-is-a-simple-scenario-used-for-reporting",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3832759,
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
  "duration": 242642570,
  "status": "passed"
});
formatter.match({
  "location": "SimpleStepDef_Reporting.i_have_to_print_custom_report()"
});
formatter.result({
  "duration": 62309,
  "status": "passed"
});
formatter.after({
  "duration": 86519,
  "status": "passed"
});
formatter.after({
  "duration": 75084,
  "status": "passed"
});
});