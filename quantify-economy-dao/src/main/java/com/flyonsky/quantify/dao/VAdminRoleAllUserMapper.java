package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.VAdminRoleAllUser;
import com.flyonsky.quantify.entity.VAdminRoleAllUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAdminRoleAllUserMapper {
    int countByExample(VAdminRoleAllUserExample example);

    int deleteByExample(VAdminRoleAllUserExample example);

    int insert(VAdminRoleAllUser record);

    int insertSelective(VAdminRoleAllUser record);

    List<VAdminRoleAllUser> selectByExample(VAdminRoleAllUserExample example);

    int updateByExampleSelective(@Param("record") VAdminRoleAllUser record, @Param("example") VAdminRoleAllUserExample example);

    int updateByExample(@Param("record") VAdminRoleAllUser record, @Param("example") VAdminRoleAllUserExample example);
}