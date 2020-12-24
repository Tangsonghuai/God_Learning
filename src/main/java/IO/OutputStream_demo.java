package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/24 19:58
 */

/*
* 文件写入  字节形式
* */
public class OutputStream_demo {
    public static void main(String[] args) throws Exception {
        File file = new File("D:"+File.separator+"game"+File.separator+"result.txt");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdir();
        }
        FileOutputStream outputStream_demo =new FileOutputStream(file);
        String str01="hello,Tony!";
        outputStream_demo.write(str01.getBytes());
        outputStream_demo.close();
    }
}
