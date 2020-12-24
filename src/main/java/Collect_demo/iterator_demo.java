package Collect_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/24 21:43
 */
public class iterator_demo {
    public static void main(String[] args) {
        Set<String> strings =new HashSet<String>();
        strings.add("a");
        strings.add("a");
        strings.add("b");
        strings.add("c");
        Iterator<String> iterable =strings.iterator();
        while (iterable.hasNext()){       //判断集合中是否还有元素
            String str =iterable.next(); //取出当前元素
            System.out.println(str+"  _  ");
        }

    }
}
