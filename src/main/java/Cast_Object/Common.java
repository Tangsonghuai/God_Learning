package Cast_Object;

import lombok.Data;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/17 19:55
 */

/*
* 如果没有泛型的话，接收数据是这样的
*/
    @Data    // 注解，省略属性的  Get/Set 方法
public class Common {
    private Object x;       // Object类型，可以接收任何数据类型的数据
    private Object y;

    public static void main(String[] args) {
        Common common=new Common();
        common.setX(10);
        common.setY("Tony");
        // 这里X，Y 还没确定数据类型，，10 也可以为String类型，所以需要向下转型   Object -> Int && string
        int x_result =(Integer) common.getX();  //Object -> Integer
        String y_result= (String) common.getY(); // Object -> String
        System.out.println("X:"+x_result);
        System.out.println("Y:"+y_result);
    }
}
