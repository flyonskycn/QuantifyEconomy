package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.VAnnualReport;
import com.flyonsky.quantify.entity.VAnnualReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAnnualReportMapper {
    int countByExample(VAnnualReportExample example);

    int deleteByExample(VAnnualReportExample example);

    int insert(VAnnualReport record);

    int insertSelective(VAnnualReport record);

    List<VAnnualReport> selectByExample(VAnnualReportExample example);

    int updateByExampleSelective(@Param("record") VAnnualReport record, @Param("example") VAnnualReportExample example);

    int updateByExample(@Param("record") VAnnualReport record, @Param("example") VAnnualReportExample example);
}