package com.flyonsky.quantify.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 响应数据，包含基类状态信息
 * @author andy
 * @date 2016年5月19日
 * @param <T>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData<T> extends ResponseCode {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2542593726245892354L;
	
	private T data;

	/**
	 * 获取附加数据
	 * @return
	 */
	public T getData() {
		return data;
	}

	/**
	 * 设置附加数据
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}

}
