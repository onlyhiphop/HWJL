package com.liao.hw.api.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaUserService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import cn.hutool.core.lang.Dict;
import com.liao.hw.api.entity.ResultBean;
import com.liao.hw.common.service.UserService;
import com.liao.hw.mbg.entity.User;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/11 10:02
 */
@Slf4j
@RestController
@RequestMapping("${apiPath}/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private WxMaService wxMaService;

    /**
     * 在所有方法之前执行，将结果放到Model对象中
     * name属性，给属性取个名称，后面通过此名称来取出
     * @param request
     * @return
     */
    @ModelAttribute(name = "openId")
    public String getUser(HttpServletRequest request){
        String openId =  (String) request.getAttribute("openId");
        return openId;
    }

    /**
     * 登录
     * @param encryptedData 消息密文
     * @param iv 加密算法的初始向量
     * @param code
     * @param request
     * @return
     * @throws WxErrorException
     */
    @GetMapping("/login")
    public ResultBean login(String encryptedData,
                            String iv,
                            String code,
                            HttpServletRequest request) throws WxErrorException {
        WxMaUserService wxMaUserService = wxMaService.getUserService();
        WxMaJscode2SessionResult sessionInfo = wxMaUserService.getSessionInfo(code);
        String openId = sessionInfo.getOpenid();
        String sessionKey = sessionInfo.getSessionKey();
        WxMaUserInfo userInfo = wxMaUserService.getUserInfo(sessionKey, encryptedData, iv);
        //存在 修改登录时间，不存在插入数据
        User user = userService.saveUser(userInfo);
        Dict dict = Dict.create().set("token", user.getId());
        return ResultBean.success(dict);
    }

    /**
     * 获取用户个人页面信息
     * @return
     */
    @GetMapping("/info")
    public ResultBean info(@ModelAttribute(name = "openId") String openId){
        Map maps = userService.findUserCenter(openId);
        return ResultBean.success(maps);
    }


}
