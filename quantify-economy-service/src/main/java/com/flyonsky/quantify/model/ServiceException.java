package com.flyonsky.quantify.model;

/**
 * 业务异常
 * @author andy
 * @date 2016年5月19日
 */
public class ServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -546646587720959305L;
	
	private int errorCode;

	/**
	 * 异常消息的构造函数
	 * @param message
	 */
	public ServiceException(String message){
		super(message);
		errorCode=1;
	}
	
	/**
	 * 带异常码的构造函数
	 * @param errorCode 异常码
	 * @param message 异常消息
	 */
	public ServiceException(int errorCode,String message){
		super(message);
		this.setErrorCode(errorCode);
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
