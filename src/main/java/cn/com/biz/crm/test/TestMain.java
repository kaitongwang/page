package cn.com.biz.crm.test;

import cn.com.biz.common.util.PageReq;
import cn.com.biz.common.util.PageUtil;
import cn.com.biz.crm.Vo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述: 测试分页工具
 *
 * @Author: Kt.w
 * @Date: 2018/12/19
 * @Version 1.0
 * @since 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        List<User>list = new ArrayList<User>();
        User user0 = new User("wkt0");
        list.add(user0);
        User user1 = new User("wkt1");
        list.add(user1);
        User user2 = new User("wkt2");
        list.add(user2);
        User user3 = new User("wkt3");
        list.add(user3);
        User user4 = new User("wkt4");
        list.add(user4);
        User user5 = new User("wkt5");
        list.add(user5);
        User user6 = new User("wkt6");
        list.add(user6);
        User user7 = new User("wkt7");
        list.add(user7);
        User user8 = new User("wkt8");
        list.add(user8);
        User user9 = new User("wkt9");
        list.add(user9);
        List<User>list1 = new ArrayList<User>();
         PageReq pageReq= PageUtil.getPageList(5,2,list);
        System.out.println(pageReq);
    }
}
