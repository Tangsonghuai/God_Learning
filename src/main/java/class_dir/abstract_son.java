package class_dir;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/11 12:23
 */
public class abstract_son extends abstract_father {
    String name;
    public abstract_son(){                        //声明一个类的时候，默认会为类声明一个空构造器用于实例化传值，可省略不写

    }

    public abstract_son(String name){
        this.name=name;                   //传值是从右往左进行传值，this指的是当前对象（son），右边的name是传进去的值
    }

    public void tell(){
        System.out.println("已重写父类方法");
  }
    public static void main(String[] args) {
        abstract_son ab01=new abstract_son();                          //构造器 case 1
        abstract_son ab =new abstract_son("构造器传参-拓展");      //构造器 case 2
        ab.tell();

    }
}
