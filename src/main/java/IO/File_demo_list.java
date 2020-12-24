package IO;

import java.io.File;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/24 19:41
 */

/*
* 列出D盘所有的文件信息
* */
public class File_demo_list {
    public static void listDir(File file) {
        if (file.isDirectory()) {
            File results[] = file.listFiles();
            if (results != null) {                        //如果不是空文件夹
                for (int i = 0; i < results.length; i++) {
                    listDir(results[i]);
                }
            }
        }
            System.out.println(file);
    }
    public static void main(String[] args) {
        File file =new File("D:"+File.separator);
        listDir(file);
    }
}
