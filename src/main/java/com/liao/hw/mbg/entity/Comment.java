package com.liao.hw.mbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "用户openid")
    private String openId;

    @ApiModelProperty(value = "评论文字内容")
    private String commentContent;

    @ApiModelProperty(value = "评论图片")
    private String commentImg;

    @ApiModelProperty(value = "评论时间")
    private Date createDate;

    @ApiModelProperty(value = "环境评分")
    private Integer environment;

    @ApiModelProperty(value = "服务评分")
    private Integer service;

    @ApiModelProperty(value = "口味评分")
    private Integer taste;

    @ApiModelProperty(value = "总平均分")
    private Integer score;

    @ApiModelProperty(value = "0正常，1删除")
    private String delFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(String commentImg) {
        this.commentImg = commentImg;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getEnvironment() {
        return environment;
    }

    public void setEnvironment(Integer environment) {
        this.environment = environment;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getTaste() {
        return taste;
    }

    public void setTaste(Integer taste) {
        this.taste = taste;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openId=").append(openId);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", commentImg=").append(commentImg);
        sb.append(", createDate=").append(createDate);
        sb.append(", environment=").append(environment);
        sb.append(", service=").append(service);
        sb.append(", taste=").append(taste);
        sb.append(", score=").append(score);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}