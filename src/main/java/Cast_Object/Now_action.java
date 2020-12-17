package Cast_Object;

import lombok.Data;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/17 20:02
 */
/*
* 为了避免频繁的装箱拆箱操作，泛型就出来了，泛型理论上可以接收任何数据类型的数据
* */
    @Data
public class Now_action<T>  {
    private T x;
    private T y;
    public static void main(String[] args) {
        Now_action<Integer> now_action =new Now_action<Integer>();  //类型只能是引用类型+String，不能是java基本类型
        now_action.setX(66);
        now_action.setY(88);
        int x= now_action.getX();
        int y= now_action.getY();
        
        System.out.println(x+"-- --"+y);
    }

}
