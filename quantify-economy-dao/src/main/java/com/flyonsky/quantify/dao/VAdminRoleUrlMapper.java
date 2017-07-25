package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.VAdminRoleUrl;
import com.flyonsky.quantify.entity.VAdminRoleUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAdminRoleUrlMapper {
    int countByExample(VAdminRoleUrlExample example);

    int deleteByExample(VAdminRoleUrlExample example);

    int insert(VAdminRoleUrl record);

    int insertSelective(VAdminRoleUrl record);

    List<VAdminRoleUrl> selectByExample(VAdminRoleUrlExample example);

    int updateByExampleSelective(@Param("record") VAdminRoleUrl record, @Param("example") VAdminRoleUrlExample example);

    int updateByExample(@Param("record") VAdminRoleUrl record, @Param("example") VAdminRoleUrlExample example);
}