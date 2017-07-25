package com.flyonsky.quantify.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public class QueryFilter {
	
	private List<QueryFilter> filters=new ArrayList<QueryFilter>();
	
	
	private String field;
	
	/**
	 * 获取过滤字段名
	 * @return
	 */
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	/**
	 * 过滤字段类型：number,text,date
	 * @return
	 */
	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	/**
	 * 获取操作符，或关系.组关系:and,or；操作符:equal,not_begins_with,begins_with,contains....
	 * @return
	 */
	public String getOperate() {
		return operate;
	}

	public void setOperate(String operate) {
		this.operate = operate;
	}

	/**
	 * 获取过滤值。可能是字符串，数字，List
	 * @return
	 */
	public Object getFilterValue() {
		return filterValue;
	}

	public void setFilterValue(Object filterValue) {
		this.filterValue = filterValue;
	}

	private String filterType;
	
	private String operate;
	
	private Object filterValue;
	
	protected String getOp() {
		switch(operate){
			case "equal":
				return "=";
			case "not_equal":
				return "!=";
			case "is_null":
				return "is null";
			case "is_not_null":
				return "is not null";
			case "begins_with":
				return "like";
			case "ends_with":
				return "like";
			case "contains":
				return "like";
			case "not_begins_with":
				return "not like";
			case "not_ends_with":
				return "not like";
			case "not_contains":
				return "not like";
			case "is_empty":
				return "=";
			case "is_not_empty":
				return "!=";
			case "in":
				return "in";
			case "not_in":
				return "not in";
			case "less":
				return "<";
			case "less_or_equal":
				return "<=";
			case "greater":
				return ">";
			case "greater_or_equal":
				return ">=";
			default:
				return operate;
		}
	}

	/**
	 * 获取子过滤器
	 * @return
	 */
	public List<QueryFilter> getFilters() {
		return filters;
	}

	public void setFilters(List<QueryFilter> filters) {
		this.filters = filters;
	}

	/**
	 * 获取生成好的SQL
	 */
	@Override
	public String toString() {
		return sql(this);
	}
	
	/**
	 * 
	 * @param filter
	 * @return
	 */
	private String sql(QueryFilter filter){
		StringBuilder sb=new StringBuilder();
		if(filter.getFilters().size()>0){
			sb.append("(");
			List<String> ls=new ArrayList<String>();
			for(QueryFilter sub:filter.getFilters()){
				ls.add(sql(sub));
			}
			sb.append(StringUtils.collectionToDelimitedString(ls, " "+filter.getOperate()+" "));
			sb.append(")");
		}else{
			String op=filter.getOperate();
			String value="";
			Object v=filter.getFilterValue();
			if("is_empty".equals(op)||"is_not_empty".equals(op)){
				value="''";
			}else if("in".equals(op)||"not_in".equals(op)){
				if(v instanceof String[]){
					String[] ls= (String[])v;
					value="("+String.join(",", ls)+")";
				}else{
					value="("+v.toString()+")";
				}
			}else if("contains".equals(op)||"not_contains".equals(op)){
				value="'%"+v.toString()+"%'";
			}else if("ends_with".equals(op)||"not_ends_with".equals(op)){
				value="'%"+v.toString()+"'";
			}else if("begins_with".equals(op)||"not_begins_with".equals(op)){
				value="'"+v.toString()+"%'";
			}else if(v!=null){
				if("date0".equals(filter.getFilterType())){
					value="'"+v.toString()+"'";
				}else if("text".equals(filter.getFilterType())){
					value="'"+v.toString()+"'";
				}else{
					value=v.toString();
				}
			}
			sb.append(filter.getField()+" "+filter.getOp()+" "+value);
		}
		return sb.toString();
	}
	
	
	

}
