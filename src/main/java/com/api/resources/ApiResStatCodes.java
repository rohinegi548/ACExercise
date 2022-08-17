package com.api.resources;

public enum ApiResStatCodes {

	AddCategoryAPI("/v1/Categories"), //just a placeholder for demo
	GetAllCategoriesAPI("/v1/Categories/Details.json"), //just a placeholder for demo
	GetCategoryAPI("/v1/Categories/{category}/Details.json"), 
	DeleteCategoryAPI("/v1/Categories/{category}"), //just a placeholder for demo
	UpdateCategoryAPI("/v1/Categories/{category}"), //just a placeholder for demo
	StatCode200("200"),
	StatCode404("404");
	
	private String resource;

	ApiResStatCodes(String resource) {
		this.resource = resource;
	}

	public static String getResource(String res) {
		ApiResStatCodes ar = ApiResStatCodes.valueOf(res);
		return ar.resource;
		
	}

}
