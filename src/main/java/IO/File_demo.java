package IO;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
//        File file =new File("D:\\game\\123.txt");
        File file=new File("D:"+File.separator+"game"+File.separator+"LOL"+File.separator+"123.txt");   //等同于上行操作，避免了在不同的操作系统下的代码兼容问题

        /*
        * 文件基本操作方法
        * */
        System.out.println("文件是否可读"+file.canRead());
        System.out.println("文件是否可写"+file.canWrite());
        System.out.println("文件大小"+ file.length()/(double) 1024 /(double) 1024 +"M");
        System.out.println("文件最后修改时间"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
        System.out.println("是目录吗"+file.isDirectory());
        System.out.println("是文件吗"+file.isFile());


//        列出 目录组成
        File file1=new File("D:"+File.separator);  //只能列出一级目录名称
        if (file1.isDirectory()){
            File result[]= file1.listFiles();
            for (int i = 0; i < result.length; i++) {
                System.out.println("列出目录"+result[i]);
            }
        }


        if (!file.getParentFile().exists()){ // 判断文件的父级目录是否存在，即123.txt上的game 文件夹
            System.out.println("父级目录不存在");
            System.out.println("创建父目录");
            file.getParentFile().mkdir();
        }
        else {
            System.out.println("父目录存在");
        }


        if (file.exists()){              //文件操作
            System.out.println("文件已存在，执行删除操作（可选）");
//            file.delete();   可选，是否执行删除操作
        }else {
            //如果文件不存在则新建文件
            System.out.println("文件不存在");
            try {
                file.createNewFile();
            } catch (IOException e) {    //抛出IO异常
                e.printStackTrace();     //抛出堆栈信息
            }
        }

    }
}
