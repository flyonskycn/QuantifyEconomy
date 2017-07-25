package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.ReportChart;
import com.flyonsky.quantify.entity.ReportChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportChartMapper {
    int countByExample(ReportChartExample example);

    int deleteByExample(ReportChartExample example);

    int deleteByPrimaryKey(Integer chartid);

    int insert(ReportChart record);

    int insertSelective(ReportChart record);

    List<ReportChart> selectByExample(ReportChartExample example);

    ReportChart selectByPrimaryKey(Integer chartid);

    int updateByExampleSelective(@Param("record") ReportChart record, @Param("example") ReportChartExample example);

    int updateByExample(@Param("record") ReportChart record, @Param("example") ReportChartExample example);

    int updateByPrimaryKeySelective(ReportChart record);

    int updateByPrimaryKey(ReportChart record);
}