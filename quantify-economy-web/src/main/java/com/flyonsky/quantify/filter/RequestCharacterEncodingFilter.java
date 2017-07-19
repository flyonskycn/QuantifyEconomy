/**
 * 深圳市可可卓科科技有限公司 版权所有
 * 作者：     andy.zhang
 * 创建时间：2016年8月26日 下午5:42:02
 * 作用： TODO
 */
package com.flyonsky.quantify.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 继承spring中的CharacterEncodingFilter。 同时去掉当无session时url中会增加的jsessionid。
 * @author andy
 * @date 2016年8月26日
 */
public class RequestCharacterEncodingFilter extends CharacterEncodingFilter {

	/* (non-Javadoc)
	 * @see org.springframework.web.filter.CharacterEncodingFilter#doFilterInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		 HttpServletResponseWrapper wrappedResponse = new HttpServletResponseWrapper(response) {
             @Override
            public String encodeRedirectUrl(String url) {
                return url;
             }
 
          
            public String encodeRedirectURL(String url) {
                return url;
             }
 
            
            public String encodeUrl(String url) {
                return url;
             }
 
            
            public String encodeURL(String url) {
                return url;
             }
         };
		super.doFilterInternal(request, wrappedResponse, filterChain);
	}
}
