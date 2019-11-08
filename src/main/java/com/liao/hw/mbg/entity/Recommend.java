package com.liao.hw.mbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Recommend implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "名称")
    private String rcmName;

    @ApiModelProperty(value = "推荐菜图片")
    private String rcmImg;

    @ApiModelProperty(value = "价格")
    private BigDecimal rcmPrice;

    @ApiModelProperty(value = "是否推荐")
    private String isRecommend;

    @ApiModelProperty(value = "推荐排名")
    private Integer sort;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    private String delFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRcmName() {
        return rcmName;
    }

    public void setRcmName(String rcmName) {
        this.rcmName = rcmName;
    }

    public String getRcmImg() {
        return rcmImg;
    }

    public void setRcmImg(String rcmImg) {
        this.rcmImg = rcmImg;
    }

    public BigDecimal getRcmPrice() {
        return rcmPrice;
    }

    public void setRcmPrice(BigDecimal rcmPrice) {
        this.rcmPrice = rcmPrice;
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        sb.append(", rcmName=").append(rcmName);
        sb.append(", rcmImg=").append(rcmImg);
        sb.append(", rcmPrice=").append(rcmPrice);
        sb.append(", isRecommend=").append(isRecommend);
        sb.append(", sort=").append(sort);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}