package com.liao.hw.common.service;

import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.liao.hw.mbg.entity.User;
import com.liao.hw.mbg.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/8 17:06
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 存入用户: 判断是否存在，存在就更新，不存在就存入
     * @return user
     */
    public User saveUser(WxMaUserInfo wxMaUserInfo){
        User user = userMapper.findUserByOpenId(wxMaUserInfo.getOpenId());
        if (user == null){
            User user1 = getUser(wxMaUserInfo);
            userMapper.insert(user1);
            return user1;
        }else {
            userMapper.updateDate(user.getId());
        }
        return user;
    }

    /**
     * 查找用户个人中心信息
     */
    public Map findUserCenter(String openId){
        return userMapper.findUserCenter(openId);
    }



    /**
     * 将WxMaUserInfo封装成我们自己的User
     */
    public User getUser(WxMaUserInfo userInfo){
        User user = new User();
        //生成id
        String uuid = UUID.randomUUID().toString();
        user.setId(uuid);
        user.setOpenId(userInfo.getOpenId());
        user.setUnionId(userInfo.getUnionId());
        user.setNickName(userInfo.getNickName());
        user.setAvatarUrl(userInfo.getAvatarUrl());
        user.setGender(userInfo.getGender());
        user.setCity(userInfo.getCity());
        user.setProvince(userInfo.getProvince());
        return user;
    }

    /**
     * 通过token查找用户
     * @param token
     * @return
     */
    public User findUserById(String token) {
        return userMapper.findUserById(token);
    }
}
