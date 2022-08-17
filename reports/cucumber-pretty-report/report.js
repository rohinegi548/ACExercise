$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/api/features/SanboxApiValidation.feature");
formatter.feature({
  "name": "Validation of GET Category API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate GET API response for TM Sandbox Category",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User hit the API to get details for category \"6327\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.api.stepdefinitions.stepDefinitions.user_hit_the_API_to_get_details_for_category(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"GetCategoryAPI\" with \"GET\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "com.api.stepdefinitions.stepDefinitions.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The API call got success with status code \"StatCode200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.api.stepdefinitions.stepDefinitions.The_API_call_got_success_with_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Name\" field is having value \"Carbon credits\" present in API response",
  "keyword": "And "
});
formatter.match({
  "location": "com.api.stepdefinitions.stepDefinitions.field_is_having_value_present_in_API_response(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"CanRelist\" field is having value as true present in API response",
  "keyword": "And "
});
formatter.match({
  "location": "com.api.stepdefinitions.stepDefinitions.field_is_having_value_as_true_present_in_API_response(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Promotions element with Name \"Gallery\" has a Description that contains the text \"Good position in category\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.api.stepdefinitions.stepDefinitions.the_Promotions_element_with_Name_has_a_Description_that_contains_the_text(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});