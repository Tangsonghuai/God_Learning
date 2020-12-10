package class_dir;
import lombok.Data;
/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/10 12:43
 */
@Data    //为类省略 get /set 方法
public class student extends person {

    String son_01="子类属性";
    public String son02(){
        return son_01;
    }
    public void tell(){
        //可以覆写父类方法
        System.out.println("子类覆写父类方法");
    }


    public static void main(String[] args) {
        student student =new student();
        student.setAge(12);                 // 父类 引入 lombok 包，@data注解可省略定义参数 set/get方法
        student.setName("Tony");
        student.tell("传参");                     //子类可以重用父类的属性与方法，前提是父类修饰属性/方法用的关键字是 public/protect，不可private，private作用域在本类中
        student.tell();//子类

        System.out.println(student.name+" 's age "+student.age);

        //执行子类的属性/方法
        System.out.println(student.son02());

    }
}
