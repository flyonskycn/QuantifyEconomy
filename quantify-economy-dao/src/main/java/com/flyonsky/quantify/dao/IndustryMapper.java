package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.Industry;
import com.flyonsky.quantify.entity.IndustryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryMapper {
    int countByExample(IndustryExample example);

    int deleteByExample(IndustryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Industry record);

    int insertSelective(Industry record);

    List<Industry> selectByExample(IndustryExample example);

    Industry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Industry record, @Param("example") IndustryExample example);

    int updateByExample(@Param("record") Industry record, @Param("example") IndustryExample example);

    int updateByPrimaryKeySelective(Industry record);

    int updateByPrimaryKey(Industry record);
}