
package com.flyonsky.quantify.model;

/**
 * 基础查询信息
 * @author luowg
 * @date 2017年7月25日
 */
public class QueryInfo {

	private int page=0;
	
	private int pageSize=10;
	
	private String order;
	
	private String sort="";
	
	private int count=0;
	
	private int totalPage;
	
	private String orderByClause;
	
	private String queryFilter;
	
	private boolean withBLOB=false;

	/**
	 * 当前页码。0...N
	 * @return
	 */
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * 分页大小 1...10000
	 * @return
	 */
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		this.totalPage=(int) Math.ceil(count*1.0/pageSize);
	}
	
	
	public void setPage_num(int page) {
		this.page = page-1;
	}
	
	public void setRows_per_page(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 排序字段
	 * @return
	 */
	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	/**
	 * 排序方向 :asc;desc
	 * @return
	 */
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
	 * 获取记录总数
	 * @return
	 */
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		this.totalPage=(int) Math.ceil(count*1.0/pageSize);
	}

	/**
	 * 获取分页总数
	 * @return
	 */
	public int getTotalPage() {
		return totalPage;
	}
	
	/**
	 * 获取首页索引
	 * @return
	 */
	public int getFirstPage(){
		return 0;
	}
	
	/**
	 * 获取尾页索引
	 * @return
	 */
	public int getTailPage(){
		return totalPage>0?totalPage-1:0;
	}
	
	/**
	 * 获取上一页索引
	 * @return
	 */
	public int getPreviousPage(){
		return page>0?page-1:0;
	}
	
	/**
	 * 获取下一页索引
	 * @return
	 */
	public int getNextPage(){
		return page<totalPage-1?page+1:page;
	}

	public String getOrderByClause() {
		if(orderByClause!=null){
			return orderByClause;
		}else if(order!=null){
			return order+" "+sort;
		}
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getQueryFilter() {
		return queryFilter;
	}

	public void setQueryFilter(String queryFilter) {
		this.queryFilter = queryFilter;
	}

	public boolean isWithBLOB() {
		return withBLOB;
	}

	public void setWithBLOB(boolean withBLOB) {
		this.withBLOB = withBLOB;
	}
}
