package com.co.google.exceptions;

public class ResultNotWaitedException extends AssertionError {

	private static final long serialVersionUID = -2037953033720743195L;
	public ResultNotWaitedException(String message) {
        super(message);
    }	
}
