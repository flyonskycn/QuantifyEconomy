package com.flyonsky.quantify.dao;

import com.flyonsky.quantify.entity.VAdminUser;
import com.flyonsky.quantify.entity.VAdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAdminUserMapper {
    int countByExample(VAdminUserExample example);

    int deleteByExample(VAdminUserExample example);

    int insert(VAdminUser record);

    int insertSelective(VAdminUser record);

    List<VAdminUser> selectByExample(VAdminUserExample example);

    int updateByExampleSelective(@Param("record") VAdminUser record, @Param("example") VAdminUserExample example);

    int updateByExample(@Param("record") VAdminUser record, @Param("example") VAdminUserExample example);
}