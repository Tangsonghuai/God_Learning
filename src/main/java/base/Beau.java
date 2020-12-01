//Z1H49F5358114H3224279DFD3FF06211

package base;
/*
* 面向对象内容
*  面向对象三要素                |继承  子类继承父类，使用父类的方法和变量/常量
*                               |封装  例如java 基本类型的封装类型，
*                               |多态  子类多态。多个子类
*  实例化对象是在类中实例化的，类就像一个单机游戏，例如忍者神龟，出来的一个个小兵就是对象，每个小兵有自己的武器和服装，就是类的方法和属性
* */
public class Beau {            //类名
    /*
    * 类属性定义
    * */
    public static  void printInfo(){
        System.out.println("类中定义方法前声明   static 关键字就是说明此方法是类自己的方法，不需要进行实例化，例如忍者神龟游戏的房屋信息，是游戏打开的时候自动加载的，不需要实例化对象进行操作");
        System.out.println("_________程序开始运行__________");
        System.out.println("AnyBytes!");
    }

    /*
    * 类变量，方法定义
    *
    * */
    String name;
    int age;
    String Yt="这是一个常量";
   public void tell(){
       System.out.println(name+"  "+age+"无返回值的方法");
   }
   public String tell_2(){
       return name+"  "+age+"必须有一个String类型的返回值";   //name与age并没有被传值
   }
   public String tell_2(String name){                  //方法的重载
       return name+ "Is the Better One";
   }
   public String tell_2(String name,int age){          //方法的重载，对象声明几个参数，程序会自动找到参数名与参数个数与方法名一致的方法执行
       return name+age+"方法重载";
   }





    public static void main(String[] args) {
      //创建对象，也就是类的实例化
        Beau beau=new Beau();                                 //这个beau就叫做这个类的对象，他可以创造出很多忍者神龟里面的小兵，在这里，他可以调用任意类中的方法和变量
        System.out.println(beau.Yt);                          //调用并输出类中定义的常量
        beau.tell();                                          //调用tell方法，因为name和age并未初始化，也未传值，所以在对象调用的时候，找不到name和age的内存地址，故自动初始化，age初始化为0，string初始化为 null
        System.out.println( beau.tell_2());                   //调用一个具有返回值的方法，输出返回值即可
        System.out.println(beau.tell_2("Cloud"));      //重载方法tell_2,传值一个string类型的值，程序会自动调用 tell_2(String)
        System.out.println(beau.tell_2("Cloud",66)); //重载的又一个例子

    }
}
