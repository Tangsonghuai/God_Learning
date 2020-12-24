package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/24 20:14
 */

/*
* java  操作文件避免了字节的转换操作，采取了直接操作字符串的方式
* */
public class Write_demo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:"+File.separator+"game"+File.separator+"result.txt");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdir();
        }
        Writer out = new FileWriter(file);
        out.write("Hello .Jommy!  ");
        out.append("WWW.BAIDU.COM");
//        out.close(); //文件关闭后，缓冲区的文件会进入到文件
        out.flush();  //刷新缓冲区的数据到文件中
    }
}
