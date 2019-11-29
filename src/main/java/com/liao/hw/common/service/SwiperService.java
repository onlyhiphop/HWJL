package com.liao.hw.common.service;

import com.liao.hw.mbg.entity.Swiper;
import com.liao.hw.mbg.mapper.SwiperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/8 17:06
 */
@Service
public class SwiperService {

    @Autowired
    private SwiperMapper swiperMapper;

    /**
     * api:查询所有轮播图
     */
    public List<Swiper> findAllSwiper(){
        return swiperMapper.findAllSwiper();
    }
}
