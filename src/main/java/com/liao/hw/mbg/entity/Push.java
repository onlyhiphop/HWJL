package com.liao.hw.mbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Push implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "推送者名称")
    private String pushName;

    @ApiModelProperty(value = "头像")
    private String pushAvator;

    @ApiModelProperty(value = "推送图片")
    private String pushImg;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "是否推送, 0推送，1不推送")
    private String isPush;

    @ApiModelProperty(value = "0正常，1删除")
    private String delFlag;

    @ApiModelProperty(value = "推送文字")
    private String pushContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPushName() {
        return pushName;
    }

    public void setPushName(String pushName) {
        this.pushName = pushName;
    }

    public String getPushAvator() {
        return pushAvator;
    }

    public void setPushAvator(String pushAvator) {
        this.pushAvator = pushAvator;
    }

    public String getPushImg() {
        return pushImg;
    }

    public void setPushImg(String pushImg) {
        this.pushImg = pushImg;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getIsPush() {
        return isPush;
    }

    public void setIsPush(String isPush) {
        this.isPush = isPush;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getPushContent() {
        return pushContent;
    }

    public void setPushContent(String pushContent) {
        this.pushContent = pushContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pushName=").append(pushName);
        sb.append(", pushAvator=").append(pushAvator);
        sb.append(", pushImg=").append(pushImg);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", isPush=").append(isPush);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", pushContent=").append(pushContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}