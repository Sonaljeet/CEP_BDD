$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@default"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Validate Login Functionality for CEP Application",
  "description": "",
  "id": "login-functionality;validate-login-functionality-for-cep-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page of CEP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "home page should get loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.userOnLoginPage()"
});
formatter.result({
  "duration": 22739276194,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.userEnterDetails()"
});
formatter.result({
  "duration": 629817658,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.userClicksLogin()"
});
formatter.result({
  "duration": 4198062322,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.homePageLoaded()"
});
formatter.result({
  "duration": 9662669047,
  "status": "passed"
});
});