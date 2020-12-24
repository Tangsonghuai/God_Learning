package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/24 20:06
 */
public class InputStream_demo {
    public static void main(String[] args) {
        File file = new File("D:"+File.separator+"game"+File.separator+"result.txt");
        if (file.exists()){
            try {
                FileInputStream inputStream_demo = new FileInputStream(file);
                byte data[] =new byte[1024];
                int len =inputStream_demo.read(data);
                //字节转为字符串
                System.out.println(new String(data,0,len));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
