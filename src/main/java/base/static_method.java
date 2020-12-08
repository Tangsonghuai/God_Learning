package base;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/8 21:06
 */

/*
*   该类是为了说明 static 关键字的作用，static 修饰的内存在共享数据区，对象都是可以引用的。（就像公共厕所，谁都不用出示身份证，都可以上）
*   static 的作用是声明类自有的变量和方法以及代码块
*
*
* */
public class static_method {
   static{   //修饰代码块
       System.out.println("Static 修饰代码块");
   }

   static String static_01="Static 修饰的变量，无需实例化对象，可直接调用";


   static void static_02(){
       System.out.println("Static 修饰的方法");
   }

    public static void main(String[] args) {
        System.out.println(static_01);
        static_02();                        // 无需类的调用  ，可直接使用（所以static关键字与this关键字不可一起使用，this表示的是当前对象，static有不需要对象也可以执行的情况，所以，static不能与this关键字连用）



    }
}
