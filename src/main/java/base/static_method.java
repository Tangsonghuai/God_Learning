package base;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/8 21:06
 */

/*
*   该类是为了说明 static 关键字的作用，static 修饰的内存在共享数据区，对象都是可以引用的。（就像公共厕所，谁都不用出示身份证，都可以上）
*   static 的作用是声明类自有的变量（全局可用）和方法以及代码块
*
*
* */
public class static_method {
   //static修饰的代码块
    static{   //修饰代码块
       System.out.println("Static 修饰代码块");
   }
   //static修饰的变量
    static String static_01="Static 修饰的变量，无需实例化对象，可直接调用";
    final static String static_03="final 修饰的变量只能被读取，无法被修改";   //final + static 代表全局常量，作用域全局且不可改变。
    public void  test(){
        System.out.println(static_01);   //全局变量可直接引用
        String static_02="局部变量,作用域在test方法内部，外部的类或对象无法直接对其引用，只有调用test方法，才能访问";
    }


   // static 修饰的方法
   static void static_02(){
       System.out.println("Static 修饰的方法");
   }   //类名/对象名 直接访问



    public static void main(String[] args) {
        System.out.println(static_01);
        static_02();                        // 无需类的调用  ，可直接使用（所以static关键字与this关键字不可一起使用，this表示的是当前对象，static有不需要对象也可以执行的情况，所以，static不能与this关键字连用）



    }
}
