package com.flyonsky.quantify.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.MethodParameter;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolverComposite;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

import com.flyonsky.quantify.model.QueryFilter;
import com.flyonsky.quantify.model.QueryInfo;

/**
 * Controller中方法QueryInfo对象参数的解析器，支持bootstrap-grid多列排序，filter过滤器
 * @author luowg
 * @date 2017年7月26日
 */
public class QueryInfoResolver extends HandlerMethodArgumentResolverComposite  {

	private ServletModelAttributeMethodProcessor processor=null;
	
	public QueryInfoResolver(){
		processor=new ServletModelAttributeMethodProcessor(false);
	}

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		// TODO Auto-generated method stub
		return parameter.getParameterType().equals(QueryInfo.class);
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		QueryInfo query= new QueryInfo();
		query=(QueryInfo)processor.resolveArgument(parameter, mavContainer, webRequest, binderFactory);
		List<String> orders=new ArrayList<String>();
		for(int i=0;i<100;i++){
			String sort="sorting["+i+"]";
			String field=sort+"[field]";
			String order=sort+"[order]";
			String orderValue=webRequest.getParameter(order);
			String fieldValue=webRequest.getParameter(field);
			if(orderValue==null||fieldValue==null){
				break;
			}else if("none".equals(orderValue)){
				continue;
			}else if(!fieldValue.matches("^[a-zA-Z0-9_]+$")){// 排序字段必须是数字或字母_,防止sql注入
				break;
			}else if("descending".equals(orderValue)){
				orders.add(fieldValue+" desc");
			}else{
				orders.add(fieldValue);
			}
			
		}
		if(orders.size()>0){
			query.setOrderByClause(StringUtils.collectionToDelimitedString(orders, ","));
		}
		handleFilter(webRequest,query);
		return query;
	}
	
	/**
	 * 处理层级过滤条件
	 * @param request
	 * @param query
	 */
	private void handleFilter(NativeWebRequest request,QueryInfo query){
		String base="filter_rules[0]";
		String operator=base+"[logical_operator]";
		String field=base+"[field]";
		String type=base+"[filterType]";
		String value=base+"[filterValue][]";
		operator=request.getParameter(operator);
		if(operator==null){
			return;
		}
		QueryFilter root=new QueryFilter();
		root.setOperate(operator);
		
		for(int i=0;i<100; i++){
			base="filter_rules["+i+"]";
			operator=base+"[logical_operator]";
			field=base+"[condition][field]";
			type=base+"[condition][filterType]";
			value=base+"[condition][filterValue][]";
			
			operator=request.getParameter(operator);
			field=request.getParameter(field);
			type=request.getParameter(type);
			String[] values=request.getParameterValues(value);
			value=request.getParameter(value);
			
			if(operator==null){
				break;
			}
			operator=base+"[condition][operator]";		
			operator=request.getParameter(operator);
			if(field!=null){
				QueryFilter filter=new QueryFilter();
				filter.setOperate(operator);
				filter.setField(field);
				filter.setFilterType(type);
				filter.setOperate(operator);
				filter.setFilterValue(values!=null && values.length>1 ? values:value);				
				root.getFilters().add(filter);
			}else{
				QueryFilter filter=subFilter(request,base);
				root.getFilters().add(filter);
			}
			
		}
		query.setQueryFilter(root.toString());
		
	}
	
	/**
	 * 子过滤条件。支持多层级关系
	 * @param request
	 * @param base
	 * @return
	 */
	private QueryFilter subFilter(NativeWebRequest request,String xbase){
		String base=xbase+"[condition][0]";
		String operator=base+"[logical_operator]";
		String field=base+"[field]";
		String type=base+"[filterType]";
		String value=base+"[filterValue][]";
		operator=request.getParameter(operator);
		if(operator==null){
			return null;
		}
		QueryFilter root=new QueryFilter();
		root.setOperate(operator);
		
		for(int i=0;i<100; i++){
			base=xbase+"[condition]["+i+"]";
			operator=base+"[logical_operator]";
			field=base+"[condition][field]";
			type=base+"[condition][filterType]";
			value=base+"[condition][filterValue][]";
			
			operator=request.getParameter(operator);
			field=request.getParameter(field);
			type=request.getParameter(type);
			//value=request.getParameter(value);
			String[] values=request.getParameterValues(value);
			value=request.getParameter(value);
			
			if(operator==null){
				break;
			}
			operator=base+"[condition][operator]";		
			operator=request.getParameter(operator);
			if(field!=null){
				QueryFilter filter=new QueryFilter();
				filter.setOperate(operator);
				filter.setField(field);
				filter.setFilterType(type);
				filter.setOperate(operator);
				filter.setFilterValue(values!=null && values.length>1 ? values:value);				
				root.getFilters().add(filter);
			}else{
				QueryFilter filter=subFilter(request,base);
				root.getFilters().add(filter);
			}
			
		}
		return root;
	}
}
