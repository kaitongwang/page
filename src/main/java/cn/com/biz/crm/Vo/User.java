package cn.com.biz.crm.Vo;

/**
 * 描述:  用户实体类
 *
 * @Author: Kt.w
 * @Date: 2018/12/19
 * @Version 1.0
 * @since 1.0
 */
public class User {

    private  String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  User (String name){
        this.name=name;
    }
}
