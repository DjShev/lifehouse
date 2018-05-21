$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("smoketest.feature");
formatter.feature({
  "line": 1,
  "name": "Create customer",
  "description": "",
  "id": "create-customer",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "create new customer",
  "description": "",
  "id": "create-customer;create-new-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open main page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter email and press join now button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify that user redirected to main page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCustomerSteps.openMainPage()"
});
formatter.result({
  "duration": 11171411591,
  "status": "passed"
});
formatter.match({
  "location": "CreateCustomerSteps.enterEmailAndPressJoinNowButton()"
});
formatter.result({
  "duration": 1383897690,
  "status": "passed"
});
formatter.match({
  "location": "CreateCustomerSteps.verifyThatUserRedirectedToMainPage()"
});
formatter.result({
  "duration": 2846744916,
  "status": "passed"
});
});