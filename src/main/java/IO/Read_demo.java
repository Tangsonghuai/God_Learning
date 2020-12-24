package IO;

import java.io.*;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/24 20:19
 */
/*
* Read 读取数据流  --字符串形式
* */
public class Read_demo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:"+File.separator+"game"+File.separator+"result.txt");
        if (file.exists()){
            Reader reader =new FileReader(file);  //向上转型
            char data[] = new char[1024];
            reader.skip(5);               // 跨越5个字符长度
            int len = reader.read(data);
            System.out.println(new String(data,0,len));
            reader.close();
        }
    }
}
