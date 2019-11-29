package com.liao.hw.mbg.mapper;

import com.liao.hw.mbg.entity.Push;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushMapper {

    /**
     * api：查询所有推送
     */
    List<Push> findAllPush();
}