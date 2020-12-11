package class_dir;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/11 12:22
 */

/*
* 抽象类就是普通类的延申，父类前加abstract关键字定义抽象类，类中方法前加入抽象方法限制某个方法（限制的方法，只需要写方法名），子类继承父类，必须实现父类中的抽象方法
* */
public abstract class abstract_father {
    private   String name ;
    public abstract void  tell();
}
