package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.AdminRoleUrl;
import com.flyonsky.quantify.entity.AdminRoleUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleUrlMapper {
    int countByExample(AdminRoleUrlExample example);

    int deleteByExample(AdminRoleUrlExample example);

    int deleteByPrimaryKey(Long ruid);

    int insert(AdminRoleUrl record);

    int insertSelective(AdminRoleUrl record);

    List<AdminRoleUrl> selectByExample(AdminRoleUrlExample example);

    AdminRoleUrl selectByPrimaryKey(Long ruid);

    int updateByExampleSelective(@Param("record") AdminRoleUrl record, @Param("example") AdminRoleUrlExample example);

    int updateByExample(@Param("record") AdminRoleUrl record, @Param("example") AdminRoleUrlExample example);

    int updateByPrimaryKeySelective(AdminRoleUrl record);

    int updateByPrimaryKey(AdminRoleUrl record);
}