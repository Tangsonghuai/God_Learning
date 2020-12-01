package base;

public class Simple {
    public static void main(String[] args) {
        /*
         * java 数据类型              | 整数类型（Byte，short，int，long）
         *                | 树型值 -  |
         *                            |浮点类型 （Float 单精度，double 双精度）  eq：单精度双精度表示小数点尾数不一致 &&  单精度一个字符占4个字节，双精度一个字符占8个字节
         *
         *                 字符型     | char
         *
         *                 布尔型     | boolean
         * */
        //Case 1: 基本类型的简单使用
        int Case_1 = 25;
        String Case_2 = "Tony";
        Double Case_3 = 105.50;
        String result = null;
        if (Case_2.equals("Tony")) {  // String 中  == 代表内容与内存地址相等，equals 只是比较值是否相等
            result = Case_1 > Case_3 ? "Case1大于Case3" : "Case1 小于Case3";   //这是三目运算符，如果问号前面的表达式成立则取问号后的第一个值，否则取第二个值，两个值以：分隔
        }
        System.out.println(result + "AND" + Case_2 + "AGE" + Case_1);

        // if 多循环
        if (Case_1 != 0) {
            System.out.println("Case_1 不为0");
        } else if (Case_1 < 10) {      //多重判断
            System.out.println("Case_1小于10");
        } else if (Case_1 < 15) {
            System.out.println("Case_1 小于15");
        } else {                                   //如果前面的匹配未命中
            System.out.println("Case_1 大于15");
        }

        // Switch 的 选择语法

        /*
         * 语法    switch(整数|字符|String|枚举 )     //value
         *        case value ：
         *                 内容满足时执行；
         *                 break;  //执行结束，如不加break，则会执行下一个case内容
         *        default:
         *             //相当于if-else语句的else语法，当内容case所有值都未命中的时候，执行default分支
         * */
        switch (Case_2) {
            case "Tom":
                System.out.println("Tom is here");
                break;
            case "Tony":
                System.out.println("Tony is here");
                break;
            default:
                System.out.println("Tony and Tom both does't here!");
        }

        //循环
        for (int i = 0; i < 10; i++) {
            if (i == 3) {                         // int 为基本类型，== 仅限于判断数值，String 属于包装类型 ，== 用于判断内存地址与值的大小的判断。
                continue;                      // continue 的意思代表，当i=3的情况下，就直接忽略掉后续步骤，直接执行i=4的情况，可以这样理解，i=3加了continue代表i=3没有入场券，被拒之门外。
            }
            System.out.println("输出i的值" + i);
        }

        //方法的使用 ，方法就是一个类的属性，可以由类创建一个对象来操控方法
        //无返回值的方法，（定义在类中，main方法之外） 见main（）方法外方法定义
        //调用方法的时候，需要实例化类名
        Simple simple=new Simple();
        simple.method_arg("ABC"); simple.method_Back01();




    }

    private void method_void() {          //无参无返回               public 是公开，其他类可以访问，protect 是父子类之间可以访问（子类访问父类）， private 只能是所在类可以访问
        System.out.println("无参返回");
    }

    private void method_arg(String arg) {
        System.out.println("value ARG" + arg);
    }

    private String method_Back(String arg01) {   //有参有返回
        return arg01+"is the value";
    }
    private String method_Back01() {   //无参有返回
        return "is the value";
    }
}
