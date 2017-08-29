package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.VIndustrySecury;
import com.flyonsky.quantify.entity.VIndustrySecuryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VIndustrySecuryMapper {
    int countByExample(VIndustrySecuryExample example);

    int deleteByExample(VIndustrySecuryExample example);

    int insert(VIndustrySecury record);

    int insertSelective(VIndustrySecury record);

    List<VIndustrySecury> selectByExample(VIndustrySecuryExample example);

    int updateByExampleSelective(@Param("record") VIndustrySecury record, @Param("example") VIndustrySecuryExample example);

    int updateByExample(@Param("record") VIndustrySecury record, @Param("example") VIndustrySecuryExample example);
}