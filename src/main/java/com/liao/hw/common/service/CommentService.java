package com.liao.hw.common.service;

import com.liao.hw.mbg.entity.Comment;
import com.liao.hw.mbg.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/8 17:06
 */
@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 查询所有所有或者个人的所有评论
     * @param openId null 为所有评论
     * @return
     */
    public List<Comment> findAllComment(String openId){
        return commentMapper.findAllComment(openId);
    }


    /**
     * 发表评论
     * @param comment
     */
    public void saveComment(Comment comment){
        commentMapper.saveComment(comment);
    }
}
