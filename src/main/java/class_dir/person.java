package class_dir;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/10 12:43
 */
@Data
public class person {                       //如果父类前 加  final 则为太监类，不能有子类 final 修饰关键字是不可改变
    String name;
    int age;
    public void  tell(String name){
        System.out.println("NAME: "+name+" AGE: "+age);
    }
}
