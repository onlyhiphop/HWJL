package com.liao.hw.mbg.mapper;

import com.liao.hw.mbg.entity.Recommend;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommendMapper {

    /**
     * api:查询所有推荐
     * @return
     */
    List<Recommend> findAllRecommend();
}