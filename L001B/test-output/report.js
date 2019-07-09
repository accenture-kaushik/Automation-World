$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/kaushikmajumder/git/Automation-World/L001B/src/main/java/com/feature/files/Simple.feature");
formatter.feature({
  "line": 1,
  "name": "This is a simple scenario used for reporting",
  "description": "",
  "id": "this-is-a-simple-scenario-used-for-reporting",
  "keyword": "Feature"
});
formatter.before({
  "duration": 323500,
  "status": "passed"
});
formatter.before({
  "duration": 6078559,
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
  "duration": 166175550,
  "status": "passed"
});
formatter.match({
  "location": "SimpleStepDef_Reporting.i_have_to_print_custom_report()"
});
formatter.result({
  "duration": 603427,
  "status": "passed"
});
formatter.after({
  "duration": 62028,
  "status": "passed"
});
formatter.after({
  "duration": 91768,
  "status": "passed"
});
formatter.after({
  "duration": 58252,
  "status": "passed"
});
formatter.before({
  "duration": 196989,
  "status": "passed"
});
formatter.before({
  "duration": 246883,
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
  "duration": 2985953387,
  "status": "passed"
});
formatter.match({
  "location": "SimpleStepDef_Reporting.validate_that_google_is_launch_correct()"
});
formatter.result({
  "duration": 10688150,
  "error_message": "java.lang.AssertionError: expected [Google1] but found [Google]\n\tat org.testng.Assert.fail(Assert.java:94)\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\n\tat org.testng.Assert.assertEquals(Assert.java:116)\n\tat org.testng.Assert.assertEquals(Assert.java:190)\n\tat org.testng.Assert.assertEquals(Assert.java:200)\n\tat com.stepdefinition.select.SimpleStepDef_Reporting.validate_that_google_is_launch_correct(SimpleStepDef_Reporting.java:68)\n\tat ✽.Then validate that google is launch correct(/Users/kaushikmajumder/git/Automation-World/L001B/src/main/java/com/feature/files/Simple.feature:8)\n",
  "status": "failed"
});
formatter.after({
  "duration": 78749,
  "status": "passed"
});
formatter.after({
  "duration": 588453956,
  "status": "passed"
});
formatter.after({
  "duration": 71969,
  "status": "passed"
});
});