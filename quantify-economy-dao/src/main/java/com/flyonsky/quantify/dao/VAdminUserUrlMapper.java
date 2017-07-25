package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.VAdminUserUrl;
import com.flyonsky.quantify.entity.VAdminUserUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAdminUserUrlMapper {
    int countByExample(VAdminUserUrlExample example);

    int deleteByExample(VAdminUserUrlExample example);

    int insert(VAdminUserUrl record);

    int insertSelective(VAdminUserUrl record);

    List<VAdminUserUrl> selectByExample(VAdminUserUrlExample example);

    int updateByExampleSelective(@Param("record") VAdminUserUrl record, @Param("example") VAdminUserUrlExample example);

    int updateByExample(@Param("record") VAdminUserUrl record, @Param("example") VAdminUserUrlExample example);
}