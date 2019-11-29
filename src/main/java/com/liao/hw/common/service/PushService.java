package com.liao.hw.common.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liao.hw.api.entity.MyPage;
import com.liao.hw.mbg.entity.Push;
import com.liao.hw.mbg.mapper.PushMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/8 17:06
 */
@Service
public class PushService {

    @Autowired
    private PushMapper pushMapper;

    /**
     * api:分页查询所有推送
     */
    public MyPage findAllPush(Integer pageNo, Integer pageSize){
        PageHelper.startPage(pageNo, pageSize);
        List<Push> lists =  pushMapper.findAllPush();
        PageInfo pageInfo = new PageInfo(lists);
        MyPage myPage = MyPage.getMyPage(pageInfo);
        return myPage;
    }
}
