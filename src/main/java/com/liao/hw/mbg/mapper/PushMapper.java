package com.liao.hw.mbg.mapper;

import com.liao.hw.mbg.entity.Push;
import com.liao.hw.mbg.entity.PushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushMapper {
    long countByExample(PushExample example);

    int deleteByExample(PushExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Push record);

    int insertSelective(Push record);

    List<Push> selectByExampleWithBLOBs(PushExample example);

    List<Push> selectByExample(PushExample example);

    Push selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Push record, @Param("example") PushExample example);

    int updateByExampleWithBLOBs(@Param("record") Push record, @Param("example") PushExample example);

    int updateByExample(@Param("record") Push record, @Param("example") PushExample example);

    int updateByPrimaryKeySelective(Push record);

    int updateByPrimaryKeyWithBLOBs(Push record);

    int updateByPrimaryKey(Push record);
}