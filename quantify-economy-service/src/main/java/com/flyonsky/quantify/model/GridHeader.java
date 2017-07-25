/**
 * 深圳市可可卓科科技有限公司 版权所有
 * 作者：     andy.zhang
 * 创建时间：2016年7月26日 上午9:22:14
 * 作用： TODO
 */
package com.flyonsky.quantify.model;

import java.io.Serializable;

/**
 * 表格列头类型
 * @author andy
 * @date 2016年7月26日
 */
public class GridHeader  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3003331656424476611L;



	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

	/**
	 * @return the header
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(String header) {
		this.header = header;
	}

	/**
	 * @return the visible
	 */
	public String getVisible() {
		return visible;
	}

	/**
	 * @param visible the visible to set
	 */
	public void setVisible(String visible) {
		this.visible = visible;
	}

	//{field: "devid", header: "设备序号", visible: "yes"},
	/**
	 * 字段名
	 */
	String field;
	
	/**
	 * 字段头名称
	 */
	String header;
	
	/**
	 * 字段可见性：yes|no
	 */
	String visible;
}
