package com.flyonsky.quantify.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 表格数据
 * @author luowg
 * @date 2017年7月25日
 * @param <T>
 */
public class GridData<T>  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2384491580988798153L;

	@JsonProperty("page_data")
	private List<T> pageData;
	
	@JsonProperty("total_rows")
	private int totalRows;
	
	@JsonProperty("error")
	private String error;
	
	@JsonProperty("debug_message")
	private List<String> debugMessage=new ArrayList<String>();
	
	@JsonProperty("filter_error")
	private List<String> filterError=new ArrayList<String>();

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<T> getPageData() {
		return pageData;
	}

	public void setPageData(List<T> pageData) {
		this.pageData = pageData;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public List<String> getDebugMessage() {
		return debugMessage;
	}

	public void setDebugMessage(List<String> debugMessage) {
		this.debugMessage = debugMessage;
	}

	public List<String> getFilterError() {
		return filterError;
	}

	public void setFilterError(List<String> filterError) {
		this.filterError = filterError;
	}


}
