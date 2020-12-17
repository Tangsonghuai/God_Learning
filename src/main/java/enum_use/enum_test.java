package enum_use;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/17 21:59
 */

/*
* 枚举类学习，枚举顾名思义，就是有限个数据，不能拓展除枚举类之外的数据
* */
    enum Color{
        a,b,c
}
public class enum_test {
    public static void main(String[] args) {
        Color cc=Color.c;
        switch (cc){
            case c:
                System.out.println("Value:C");
                break;
            case b:
                System.out.println("B");
                break;
            default:
                System.out.println("A");
        }

        //获取枚举信息

        for (Color value : Color.values()){
            System.out.println(value.ordinal()+"    --->"+value.name());   //  枚举个数+枚举值
        }

    }
}
