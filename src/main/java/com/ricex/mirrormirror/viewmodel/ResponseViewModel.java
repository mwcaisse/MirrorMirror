package com.ricex.mirrormirror.viewmodel;

import org.apache.commons.lang3.StringUtils;

public class ResponseViewModel<T> {
	
	private T data;
	
	private String errorMessage;
	
	private boolean valid;
	
	public ResponseViewModel(T data) {
		this(data, null);
	}
	
	public ResponseViewModel(T data, String errorMessage) {
		this.data = data;
		this.errorMessage = errorMessage;
		this.valid = StringUtils.isBlank(errorMessage);
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}
	
}
