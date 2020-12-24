package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/24 20:33
 */
public class BufferReader_demo {
    public static void main(String[] args) throws IOException {
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入数据!");
        String msg = input.readLine();
        if (msg.matches("\\d{1,3}")){
            int age=Integer.parseInt(msg);
            System.out.println("Age: " + age);
        }else {
            System.out.println("This not Age at all!");
        }

    }
}
