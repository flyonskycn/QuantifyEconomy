package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.VAdminRoleAllUrl;
import com.flyonsky.quantify.entity.VAdminRoleAllUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAdminRoleAllUrlMapper {
    int countByExample(VAdminRoleAllUrlExample example);

    int deleteByExample(VAdminRoleAllUrlExample example);

    int insert(VAdminRoleAllUrl record);

    int insertSelective(VAdminRoleAllUrl record);

    List<VAdminRoleAllUrl> selectByExample(VAdminRoleAllUrlExample example);

    int updateByExampleSelective(@Param("record") VAdminRoleAllUrl record, @Param("example") VAdminRoleAllUrlExample example);

    int updateByExample(@Param("record") VAdminRoleAllUrl record, @Param("example") VAdminRoleAllUrlExample example);
}