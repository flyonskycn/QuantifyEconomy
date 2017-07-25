package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.VAdminRoleUser;
import com.flyonsky.quantify.entity.VAdminRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAdminRoleUserMapper {
    int countByExample(VAdminRoleUserExample example);

    int deleteByExample(VAdminRoleUserExample example);

    int insert(VAdminRoleUser record);

    int insertSelective(VAdminRoleUser record);

    List<VAdminRoleUser> selectByExample(VAdminRoleUserExample example);

    int updateByExampleSelective(@Param("record") VAdminRoleUser record, @Param("example") VAdminRoleUserExample example);

    int updateByExample(@Param("record") VAdminRoleUser record, @Param("example") VAdminRoleUserExample example);
}