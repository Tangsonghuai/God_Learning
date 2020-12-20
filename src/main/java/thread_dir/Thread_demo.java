package thread_dir;

import lombok.Data;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/20 14:55
 */
@Data
public class Thread_demo extends Thread {
    private String title;

    Thread_demo(){}
    Thread_demo(String result){
        title=result;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(title+i+"  End!");
        }
    }

    public static void main(String[] args) {
        Thread_demo thread_demo = new Thread_demo("HELLO");
        System.out.println(Thread.currentThread().getName()+"   Thread 's Name");
        thread_demo.start();
        //等同于
        new Thread_demo("线程A").start();
        new Thread_demo("线程B").start();
        new Thread_demo("线程C").start();
        new Thread_demo("线程D").start();
    }
}
