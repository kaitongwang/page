package cn.com.biz.common.util;

import java.util.List;

/**
 * 描述:  分页返回泛型
 *
 * @Author: Kt.w
 * @Date: 2018/12/19
 * @Version 1.0
 * @since 1.0
 */
public class PageReq<T> {
    /**
     * 提示信息
     */
    private String  messasge;
    /**
     * 总记录数
     */
    private int totalRows;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 请求页
     */
    private int page;
    /**
     * 每页分页记录数
     */
    private int pageSize;
    /**
     * 分页数据
     */
    private List <T>  Data;


    public String getMessasge() {
        return messasge;
    }

    public void setMessasge(String messasge) {
        this.messasge = messasge;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getData() {
        return Data;
    }

    public void setData(List<T> data) {
        Data = data;
    }
}
