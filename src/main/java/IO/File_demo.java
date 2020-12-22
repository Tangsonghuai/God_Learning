package IO;

import java.io.File;
import java.io.IOException;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/22 20:35
 */

/*
* 文件的处理
* */
public class File_demo {
    public static void main(String[] args) {
        File file =new File("D:\\game\\123.txt");
        if (file.exists()){
            System.out.println("文件已存在，执行删除操作");
            file.delete();
        }else {
            //如果文件不存在则新建文件
            try {
                file.createNewFile();
            } catch (IOException e) {    //抛出IO异常
                e.printStackTrace();     //抛出堆栈信息
            }
        }

    }
}
