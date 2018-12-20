# page后台实现分页功能的工具类，亲测可以使用
  # 入参说明
    /**
     *
     * @param page  第几页
     * @param rows  每页数量
     * @param list   整个list列表
     * @param <T>  实体对象
     * @return  返回你要查询页的list
     */
    public static<T>  PageReq<T>  getPageList( int page,  int  rows,List<T> list){}
    
    
    
 # 返回对象说明
    
    PageReq<T> {
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
        }