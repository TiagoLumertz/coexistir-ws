package com.coexistir.controller;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.util.MultiValueMap;

public class CustomErrorType {

	private String errorMessage;
	
	public CustomErrorType(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return this.errorMessage;
	}

}
