package com.lagou.domain;

/**
 * @author:wanglei
 * @create:2022-04-25-08:53
 * @Description:接受前端传过来的数据
 */
public class PromotionAdVo {
    private Integer currentPage;
    private int pageSize;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
