package com.liao.hw.common.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liao.hw.api.entity.MyPage;
import com.liao.hw.mbg.entity.Recommend;
import com.liao.hw.mbg.mapper.RecommendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/8 17:06
 */
@Service
public class RecommendService {

    @Autowired
    private RecommendMapper recommendMapper;

    /**
     * api：分页查询所有推荐
     * @return
     */
    public MyPage findAllRecommend(Integer pageNo, Integer pageSize){
        //默认第一页，一页显示4条
        pageNo = pageNo == null ? 1 : pageNo;
        pageSize = pageSize == null ? 4 : pageSize;
        PageHelper.startPage(pageNo, pageSize);
        List<Recommend> lists = recommendMapper.findAllRecommend();
        PageInfo<Recommend> pageInfo = new PageInfo<>(lists);
        MyPage myPage = MyPage.getMyPage(pageInfo);
        return myPage;
    }

}
