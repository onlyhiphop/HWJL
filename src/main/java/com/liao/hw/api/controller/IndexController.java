package com.liao.hw.api.controller;

import com.liao.hw.api.entity.ResultBean;
import com.liao.hw.common.service.RecommendService;
import com.liao.hw.common.service.SwiperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/11 10:02
 */
@RestController
@RequestMapping("${apiPath}/index")
public class IndexController {

    @Autowired
    private SwiperService swiperService;
    @Autowired
    private RecommendService recommendService;

    /**
     * 得到所有轮播图
     * @return
     */
    @GetMapping("/swiper")
    public ResultBean swiper(HttpServletRequest request){
        return ResultBean.success(swiperService.findAllSwiper());
    }

    /**
     * 分页得到所有推荐
     * @param pageNo 页码
     * @param pageSize 数量
     * @return
     */
    @GetMapping("/recommend")
    public ResultBean recommend(Integer pageNo, Integer pageSize){
        return ResultBean.success(recommendService.findAllRecommend(pageNo, pageSize));
    }
}
