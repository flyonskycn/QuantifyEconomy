package com.flyonsky.quantify.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 表格数据
 * @author andy
 * @date 2016年5月13日
 * @param <T>
 */
public class GridData<T>  implements Serializable{

	private List<T> page_data;
	
	private int total_rows;
	
	private String error;
	
	private List<String> debug_message=new ArrayList<String>();
	
	private List<String> filter_error=new ArrayList<String>();

	public List<String> getDebug_message() {
		return debug_message;
	}

	public void setDebug_message(List<String> debug_message) {
		this.debug_message = debug_message;
	}

	public List<String> getFilter_error() {
		return filter_error;
	}

	public void setFilter_error(List<String> filter_error) {
		this.filter_error = filter_error;
	}

	public List<T> getPage_data() {
		return page_data;
	}

	public void setPage_data(List<T> page_data) {
		this.page_data = page_data;
	}

	public int getTotal_rows() {
		return total_rows;
	}

	public void setTotal_rows(int total_rows) {
		this.total_rows = total_rows;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}


}
