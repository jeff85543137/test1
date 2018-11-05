package cn.bj.pojo.base;

/**
 *
 */
public class BaseQuery {
    protected Integer pageIndex = 1;
    protected Integer pageSize = 50;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}