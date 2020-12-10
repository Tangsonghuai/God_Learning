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
public class person {
    String name;
    int age;
    public void  tell(String name){
        System.out.println("NAME: "+name+" AGE: "+age);
    }
}
