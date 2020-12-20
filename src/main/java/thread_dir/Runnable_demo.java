package thread_dir;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/20 15:35
 */

/*
* 为了避免thread的单继承局限，引入了 接口
* */
public class Runnable_demo implements Runnable{

    private String title;
    Runnable_demo(){}
    Runnable_demo(String name){
        this.title=name;
    }


    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread "+title+"<-- -->"+i);
        }
    }

    public static void main(String[] args) {


        Thread thread =new Thread(new Runnable_demo("Thread "));
        Thread thread01 =new Thread(new Runnable_demo("Other  "));
        Thread thread02 =new Thread(new Runnable_demo("Phone  "));
        thread01.start();
        thread.start();
        thread02.start();



    }
}
