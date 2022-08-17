Feature: Validation of GET Category API

Scenario: Validate GET API response for TM Sandbox Category
Given User hit the API to get details for category "6327"
When User calls "GetCategoryAPI" with "GET" http request
Then The API call got success with status code "StatCode200"
And "Name" field is having value "Carbon credits" present in API response
And "CanRelist" field is having value as true present in API response
And The Promotions element with Name "Gallery" has a Description that contains the text "Good position in category"
