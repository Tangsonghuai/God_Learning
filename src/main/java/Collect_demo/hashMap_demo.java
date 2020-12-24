package Collect_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/24 21:49
 */
public class hashMap_demo {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap =new HashMap<String, Integer>();
              hashMap.put("One",1);
              hashMap.put("Two",2);
              hashMap.put("Three",3);
        Set<Map.Entry<String,Integer>> set = hashMap.entrySet();    //entry 实例，可以getKey，GetValue
        for (Map.Entry<String,Integer> entry : set){
            System.out.println(entry.getKey()+"__"+entry.getValue());
        }
    }
}
