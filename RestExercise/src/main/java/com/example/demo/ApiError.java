package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiError {
      
      String exception;

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}
}