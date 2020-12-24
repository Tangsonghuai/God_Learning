package Collect_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/24 21:20
 */
public class list_demo {
    public static void main(String[] args) throws NullPointerException {
        List<String> list =new ArrayList<String>();
        list.add("a");
        list.add("b");
        System.out.println(list.contains("a")); //集合中是否含有此元素
        System.out.println(list.isEmpty());     //集合是否为空
        System.out.println(list.size());        //集合元素个数
        System.out.println(list.get(0));        //获取集合第一个元素
        Object result[] = list.toArray();

        for(Object temp : result){
            System.out.println(temp+" ");
        }
    }
}
