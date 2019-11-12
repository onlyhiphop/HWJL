package com.liao.hw.api.entity;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author LiaoBaoCai
 * @description: 封装Page，去掉PageHelper不需要的字段
 * @date 2019/11/11 10:37
 */
public class MyPage<T> {
    //下一页
    private int nextPage;
    //是否有下一页
    private boolean hasNextPage;
    //数据
    private List<T> data;

    /**
     * 得到Mypage对象
     * @param pageInfo
     * @return
     */
    public static MyPage getMyPage(PageInfo pageInfo){
        MyPage myPage = new MyPage();
        myPage.setHasNextPage(myPage.isHasNextPage());
        myPage.setData(pageInfo.getList());
        myPage.setNextPage(pageInfo.getNextPage());
        return myPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
