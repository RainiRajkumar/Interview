package com.track.exception;

public class EmployeeNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID=163182336629621859L;
	
	public EmployeeNotFoundException()
	{
	}
	
	public EmployeeNotFoundException(String message)
	{
		super(message);
	}
}
