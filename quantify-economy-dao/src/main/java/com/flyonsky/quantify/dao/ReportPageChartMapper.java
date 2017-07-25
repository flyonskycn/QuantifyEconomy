package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.ReportPageChart;
import com.flyonsky.quantify.entity.ReportPageChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportPageChartMapper {
    int countByExample(ReportPageChartExample example);

    int deleteByExample(ReportPageChartExample example);

    int deleteByPrimaryKey(Long pcid);

    int insert(ReportPageChart record);

    int insertSelective(ReportPageChart record);

    List<ReportPageChart> selectByExample(ReportPageChartExample example);

    ReportPageChart selectByPrimaryKey(Long pcid);

    int updateByExampleSelective(@Param("record") ReportPageChart record, @Param("example") ReportPageChartExample example);

    int updateByExample(@Param("record") ReportPageChart record, @Param("example") ReportPageChartExample example);

    int updateByPrimaryKeySelective(ReportPageChart record);

    int updateByPrimaryKey(ReportPageChart record);
}