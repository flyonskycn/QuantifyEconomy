package com.flyonsky.quantify.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 基础响应，返回状态码和描述。
 * @author andy
 * @date 2016年5月19日
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCode implements Serializable {

	public int getErroCode() {
		return erroCode;
	}

	public void setErroCode(int erroCode) {
		this.erroCode = erroCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * 设置状态和消息
	 * @param erroCode
	 * @param message
	 */
	public  void  set(int erroCode,String message){
		this.erroCode = erroCode;
		this.message = message;
	}
	
	/**
	 * 创建状态和消息的响应对象
	 */
	public static ResponseCode  create(int erroCode,String message){
		ResponseCode res=new ResponseCode();
		res.erroCode = erroCode;
		res.message = message;
		return res;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6870639976224089869L;
	
	private int erroCode;
	
	private String message;
	

}
