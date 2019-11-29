package com.liao.hw.mbg.mapper;

import com.liao.hw.mbg.entity.Swiper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwiperMapper {

    /**
     * 得到所有的轮播图
     */
    List<Swiper> findAllSwiper();
}