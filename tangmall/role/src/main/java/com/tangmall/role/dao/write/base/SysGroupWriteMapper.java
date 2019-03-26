package com.tangmall.role.dao.write.base;

import com.tangmall.role.model.base.SysGroup;
import com.tangmall.role.model.base.SysGroupExample;
import org.apache.ibatis.annotations.Param;

public interface SysGroupWriteMapper {
    int deleteByExample(SysGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysGroup record);

    int insertSelective(SysGroup record);

    int updateByExampleSelective(@Param("record") SysGroup record, @Param("example") SysGroupExample example);

    int updateByExample(@Param("record") SysGroup record, @Param("example") SysGroupExample example);

    int updateByPrimaryKeySelective(SysGroup record);

    int updateByPrimaryKey(SysGroup record);
}