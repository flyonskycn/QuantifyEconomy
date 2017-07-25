package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.AdminUrl;
import com.flyonsky.quantify.entity.AdminUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUrlMapper {
    int countByExample(AdminUrlExample example);

    int deleteByExample(AdminUrlExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(AdminUrl record);

    int insertSelective(AdminUrl record);

    List<AdminUrl> selectByExample(AdminUrlExample example);

    AdminUrl selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") AdminUrl record, @Param("example") AdminUrlExample example);

    int updateByExample(@Param("record") AdminUrl record, @Param("example") AdminUrlExample example);

    int updateByPrimaryKeySelective(AdminUrl record);

    int updateByPrimaryKey(AdminUrl record);
}