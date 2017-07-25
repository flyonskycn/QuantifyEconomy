package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.ReportPage;
import com.flyonsky.quantify.entity.ReportPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportPageMapper {
    int countByExample(ReportPageExample example);

    int deleteByExample(ReportPageExample example);

    int deleteByPrimaryKey(Integer pageid);

    int insert(ReportPage record);

    int insertSelective(ReportPage record);

    List<ReportPage> selectByExample(ReportPageExample example);

    ReportPage selectByPrimaryKey(Integer pageid);

    int updateByExampleSelective(@Param("record") ReportPage record, @Param("example") ReportPageExample example);

    int updateByExample(@Param("record") ReportPage record, @Param("example") ReportPageExample example);

    int updateByPrimaryKeySelective(ReportPage record);

    int updateByPrimaryKey(ReportPage record);
}