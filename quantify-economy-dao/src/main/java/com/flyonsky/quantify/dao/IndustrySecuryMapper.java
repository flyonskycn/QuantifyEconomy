package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.IndustrySecury;
import com.flyonsky.quantify.entity.IndustrySecuryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustrySecuryMapper {
    int countByExample(IndustrySecuryExample example);

    int deleteByExample(IndustrySecuryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustrySecury record);

    int insertSelective(IndustrySecury record);

    List<IndustrySecury> selectByExample(IndustrySecuryExample example);

    IndustrySecury selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustrySecury record, @Param("example") IndustrySecuryExample example);

    int updateByExample(@Param("record") IndustrySecury record, @Param("example") IndustrySecuryExample example);

    int updateByPrimaryKeySelective(IndustrySecury record);

    int updateByPrimaryKey(IndustrySecury record);
}