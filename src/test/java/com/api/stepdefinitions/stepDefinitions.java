package com.api.stepdefinitions;

import static io.restassured.RestAssured.given;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.testng.Assert;

import com.api.resources.ApiResStatCodes;
import com.api.resources.ApiUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class stepDefinitions extends ApiUtils {
	Response response;
	RequestSpecification request;
	static String CategoryId;

	@Given("User hit the API to get details for category {string}")
	public void user_hit_the_API_to_get_details_for_category(String category) throws IOException {
		request = given().spec(getReqSpecification()).pathParam("category", category);
	}

	@When("User calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String http_method) throws IOException {

		if (http_method.equalsIgnoreCase("POST")) {
			response = request.when().post(ApiResStatCodes.getResource(resource));
			// setGlobalRuntimeProperty("CategoryId", getReskeyValue(response,
			// "CategoryId"));//just for demonstration
		} else if (http_method.equalsIgnoreCase("GET"))
			response = request.when().get(ApiResStatCodes.getResource(resource));
		else if (http_method.equalsIgnoreCase("DELETE"))
			response = request.when().delete(ApiResStatCodes.getResource(resource));
		else if (http_method.equalsIgnoreCase("PUT")) {

			response = request.expect().defaultParser(Parser.JSON).when().put(ApiResStatCodes.getResource(resource));
			// System.out.println("MSG: " + getReskeyValue(response, "msg")); //just for
			// demonstration
			// setGlobalRuntimeProperty("address", ApiTestDataBuilder.getAddress()); //just
			// for demonstration
			// System.out.println("Address: " + ApiTestDataBuilder.getAddress()); //just for
			// demonstration
		}
	}

	@Then("{string} field is having value {string} present in API response")
	public void field_is_having_value_present_in_API_response(String key, String value) {

		Assert.assertEquals(getReskeyValue(response, key), value);
	}

	@Then("{string} field is having value as true present in API response")
	public void field_is_having_value_as_true_present_in_API_response(String key) {

		Assert.assertTrue(Boolean.valueOf(getReskeyBoolValue(response, key)),
				"The " + key + " value doesn't match, should be \"true\" but found: "
						+ (Boolean.valueOf(getReskeyBoolValue(response, key))));

	}

	@Then("The Promotions element with Name {string} has a Description that contains the text {string}")
	public void the_Promotions_element_with_Name_has_a_Description_that_contains_the_text(String nameValue,
			String description) {

		int len = response.jsonPath().getInt("Promotions.size()");
		boolean found = false;
		for (int i = 0; i < len; i++) {
			String name = response.jsonPath().getString("Promotions[" + i + "].Name");
			String desc = response.jsonPath().getString("Promotions[" + i + "].Description");
			if (name.equalsIgnoreCase(nameValue)) {
				found = true;
				Assert.assertEquals(desc.contains(description), true,
						"Description for Name: " + nameValue + " under Promotions does not contain: " + description);
			} else {
				Assert.assertFalse(false, "Promotions doesn't have Name with value: " + nameValue);
			}
		}
	}

	@Then("The API call got success with status code {string}")
	public void The_API_call_got_success_with_status_code(String status_code) {

		Assert.assertEquals(Integer.toString(response.getStatusCode()), ApiResStatCodes.getResource(status_code));
	}

}
