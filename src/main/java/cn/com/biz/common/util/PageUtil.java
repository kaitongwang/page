package cn.com.biz.common.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:  分页工具类
 *
 * @Author: Kt.w
 * @Date: 2018/12/19
 * @Version 1.0
 * @since 1.0
 */
public class PageUtil<T> {

    /**
     *
     * @param page  第几页
     * @param rows  每页数量
     * @param list   整个list列表
     * @param <T>  实体对象
     * @return  返回你要查询页的list
     */
    public static<T>  PageReq<T>  getPageList( int page,  int  rows,List<T> list){
        PageReq<T> pageReq = new PageReq<T>();
        pageReq.setPage(page);
        pageReq.setPageSize(rows);
        // 如果请求页或者请求记录数为空，则直接返回无记录
         if(page<1||rows<1){
             pageReq.setMessasge("查询失败");
             return pageReq;
         }
         //获取总记录数
        pageReq.setTotalRows(list.size());

         // 获取总页数，如果刚好整除，则直接去商，如果不能整除，则商取余数+1
        if(list.size()%rows!=0){
            pageReq.setTotalPage(list.size()/rows+1);
        }else {
            pageReq.setTotalPage(list.size()/rows);
        }
        // 请求页大于总页数
        if(page>pageReq.getTotalPage()){
            pageReq.setMessasge("无记录");
            return pageReq;
        }
        // 如果请求页是最后一页
        if(page ==pageReq.getTotalPage()){
            // 如果最后一页只有一条记录
            if((page-1)*rows==list.size()-1){
                List<T> list1 = new ArrayList<T>();
                list1.add(list.get(list.size()-1));
                pageReq.setData(list1);
                return pageReq;
            }else {
                //如果最后一页不止一条记录
            pageReq.setData(list.subList((page-1)*rows,list.size()));
            return  pageReq;
            }
        }else{
            // 请求页不是最后一页
            pageReq.setData(list.subList((page-1)*rows,page*rows));
            return  pageReq;
        }


    }

}
