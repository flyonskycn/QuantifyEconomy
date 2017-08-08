package com.flyonsky.quantify.model.chart;

import com.flyonsky.quantify.model.Description;

public abstract class AbstractChartData {

	/**
	 * 图表数据基类
	 * @param kpiType 指标类型
	 * @return
	 */
	public String kpiName(EnumKpiType kpiType){
		String kpiName = "";
		
		try {
			Description des = kpiType.getClass().getField(kpiType.name()).getAnnotation(Description.class);
			kpiName = des.value();
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return kpiName;
	}
	
	/**
	 * 将指标加入对应的分组图表
	 * @param code
	 * @param category
	 * @param kpi
	 * @param kpiType
	 */
	public abstract void addKpi(String code, Integer category, Double kpi, EnumKpiType kpiType);
}
