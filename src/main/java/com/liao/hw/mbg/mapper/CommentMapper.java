package com.liao.hw.mbg.mapper;

import com.liao.hw.mbg.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CommentMapper {

    /**
     * 查询所有的评论 或 个人评论
     * @param openId
     */
    List<Comment> findAllComment(@Param("openId") String openId);

    /**
     * 发表评论
     * @param comment
     */
    void saveComment(Comment comment);
}