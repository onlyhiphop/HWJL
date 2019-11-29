package com.liao.hw.api.controller;

import com.liao.hw.api.entity.MyPage;
import com.liao.hw.api.entity.ResultBean;
import com.liao.hw.common.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/11 10:03
 */
@RestController
@RequestMapping("${apiPath}/push")
public class PushController {

    @Autowired
    private PushService pushService;

    @GetMapping("/list")
    public ResultBean<MyPage> list(@RequestParam(required = false, defaultValue = "1") Integer pageNo,
                                   @RequestParam(required = false, defaultValue = "5") Integer pageSize){
        return ResultBean.success(pushService.findAllPush(pageNo, pageSize));
    }
}
