package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.AnnualReport;
import com.flyonsky.quantify.entity.AnnualReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnualReportMapper {
    int countByExample(AnnualReportExample example);

    int deleteByExample(AnnualReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnnualReport record);

    int insertSelective(AnnualReport record);

    List<AnnualReport> selectByExample(AnnualReportExample example);

    AnnualReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnnualReport record, @Param("example") AnnualReportExample example);

    int updateByExample(@Param("record") AnnualReport record, @Param("example") AnnualReportExample example);

    int updateByPrimaryKeySelective(AnnualReport record);

    int updateByPrimaryKey(AnnualReport record);
}