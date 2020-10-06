$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 215144,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on YellowCard landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login into application with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters otp",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_yellowcard_landing_page()"
});
formatter.result({
  "duration": 16482340816,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_login_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 538470837,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_enters_otp()"
});
formatter.result({
  "duration": 6056140356,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "duration": 2418405404,
  "status": "passed"
});
formatter.after({
  "duration": 64545,
  "status": "passed"
});
formatter.before({
  "duration": 47067,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Buy cryptocurrency using the wallet option",
  "description": "",
  "id": "application-login;buy-cryptocurrency-using-the-wallet-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User clicks on buy Cryptocurrency, select currency, choose payment method, enter amount and click confirm",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Success message is recieved",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_clicks_on_buy_cryptocurrency_select_currency_choose_payment_method_enter_amount_and_click_confirm()"
});
formatter.result({
  "duration": 942186373,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.success_message_is_recieved()"
});
formatter.result({
  "duration": 3070415636,
  "status": "passed"
});
formatter.after({
  "duration": 39349,
  "status": "passed"
});
formatter.before({
  "duration": 71956,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Sell cryptocurrency using the wallet option",
  "description": "",
  "id": "application-login;sell-cryptocurrency-using-the-wallet-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User clicks on sell Cryptocurrency and successfully sell",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Success message is recieved",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_clicks_on_sell_cryptocurrency_and_successfully_sell()"
});
formatter.result({
  "duration": 1886793231,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.success_message_is_recieved()"
});
formatter.result({
  "duration": 3091773673,
  "status": "passed"
});
formatter.after({
  "duration": 55912,
  "status": "passed"
});
});