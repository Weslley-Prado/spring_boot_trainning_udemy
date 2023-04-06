package com.weslley_prado.api_spring_crud.exceptions;

public class UnsupportedMathOperationException extends RuntimeException{
	public UnsupportedMathOperationException(String ex) {
		super(ex);
	}

	private static final long serialVersionUID = 1L;
}
