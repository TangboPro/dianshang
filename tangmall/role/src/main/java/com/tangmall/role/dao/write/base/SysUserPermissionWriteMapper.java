package com.tangmall.role.dao.write.base;

import com.tangmall.role.model.base.SysUserPermission;
import com.tangmall.role.model.base.SysUserPermissionExample;
import org.apache.ibatis.annotations.Param;

public interface SysUserPermissionWriteMapper {
    int deleteByExample(SysUserPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUserPermission record);

    int insertSelective(SysUserPermission record);

    int updateByExampleSelective(@Param("record") SysUserPermission record, @Param("example") SysUserPermissionExample example);

    int updateByExample(@Param("record") SysUserPermission record, @Param("example") SysUserPermissionExample example);

    int updateByPrimaryKeySelective(SysUserPermission record);

    int updateByPrimaryKey(SysUserPermission record);
}