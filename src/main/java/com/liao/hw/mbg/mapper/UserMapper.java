package com.liao.hw.mbg.mapper;

import com.liao.hw.mbg.entity.User;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
     * 根据openid查询是否存在用户
     * @param openId
     * @return User 返回用户信息
     */
    User findUserByOpenId(@Param("openId") String openId);

    /**
     * 添加用户
     * @param user
     */
    void insert(User user);

    /**
     * 更新用户信息
     * @param user
     */
    void update(User user);

    /**
     * 存在用户，更新日期
     * @param token
     */
    void updateDate(@Param("token") String token);

    /**
     * 查询用户中心信息
     * @return key:commentCount、couponCount、scoreCount
     */
    Map<String, String> findUserCenter(@Param("openId") String openId);

    /**
     * 根据 token （也就是数据库里面的id）, 查询用户信息
     * @param token
     * @return
     */
    User findUserById(@Param("token") String token);
}