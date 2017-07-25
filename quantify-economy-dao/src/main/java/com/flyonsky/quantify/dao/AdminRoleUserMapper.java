package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.AdminRoleUser;
import com.flyonsky.quantify.entity.AdminRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleUserMapper {
    int countByExample(AdminRoleUserExample example);

    int deleteByExample(AdminRoleUserExample example);

    int deleteByPrimaryKey(Long urid);

    int insert(AdminRoleUser record);

    int insertSelective(AdminRoleUser record);

    List<AdminRoleUser> selectByExample(AdminRoleUserExample example);

    AdminRoleUser selectByPrimaryKey(Long urid);

    int updateByExampleSelective(@Param("record") AdminRoleUser record, @Param("example") AdminRoleUserExample example);

    int updateByExample(@Param("record") AdminRoleUser record, @Param("example") AdminRoleUserExample example);

    int updateByPrimaryKeySelective(AdminRoleUser record);

    int updateByPrimaryKey(AdminRoleUser record);
}