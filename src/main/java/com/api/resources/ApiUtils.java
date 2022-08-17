package com.api.resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Properties;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiUtils {

	public static RequestSpecification req;
	static Properties prop;
	static OutputStream os;
	static PrintStream ps;

	public RequestSpecification getReqSpecification() throws IOException {

		if (req == null) {
			ps = new PrintStream(new FileOutputStream("logs\\APIExecution.logs"));
			req = new RequestSpecBuilder().setBaseUri(getGlobalProperty("baseURI")).addQueryParam("catalogue", "false")
					.setContentType(ContentType.JSON).addFilter(RequestLoggingFilter.logRequestTo(ps))
					.addFilter(ResponseLoggingFilter.logResponseTo(ps)).addFilter(new AllureRestAssured()).build();
		}
		return req;
	}
	
	public static PrintStream logPutResponse(){
		
		return ps;
	}

	

	public static String getGlobalProperty(String key) throws IOException {

		Properties p = new Properties();
		FileInputStream fs = new FileInputStream("src\\main\\java\\com\\api\\resources\\ApiGlobal.properties");
		p.load(fs);

		return p.getProperty(key);
	}

	
	public static String getGlobalRuntimeProperty(String key) throws IOException {

		Properties p = new Properties();
		FileInputStream fs = new FileInputStream("src\\main\\java\\com\\api\\resources\\GlobalTemp.properties");
		p.load(fs);
		fs.close();
		return p.getProperty(key);
	}
	
	public static void setGlobalRuntimeProperty(String key, String newAddress) throws IOException {
		Properties props = new Properties();
		String file = "src\\main\\java\\com\\api\\resources\\GlobalTemp.properties";
		FileInputStream fs = new FileInputStream(file);
		props.load(fs);
		fs.close();
		
		props.setProperty(key, newAddress);
		OutputStream out = new FileOutputStream(file);
		props.store(out, "Updated properties");
		out.close();
	
	}

	public String getReskeyValue(Response res, String key) {

		JsonPath js = new JsonPath(res.asString());
		return js.get(key);
	}
	
	public boolean getReskeyBoolValue(Response res, String key) {

		JsonPath js = new JsonPath(res.asString());
		return js.get(key);
	}
}
