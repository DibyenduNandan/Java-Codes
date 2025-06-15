package com.example.demo.exception;

import java.time.LocalDate;

public class ErrorMsg {
	private LocalDate dateOfError;
	private String errorMsg;
	
	
	
	public LocalDate getDateOfError() {
		return dateOfError;
	}



	public void setDateOfError(LocalDate dateOfError) {
		this.dateOfError = dateOfError;
	}



	public String getErrorMsg() {
		return errorMsg;
	}



	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}



	public ErrorMsg(LocalDate dateOfError, String errorMsg) {
		super();
		this.dateOfError = dateOfError;
		this.errorMsg = errorMsg;
	}
	
	
}
