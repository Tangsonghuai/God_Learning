package base;



/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/8 22:54
 */
/*
*    数组是一组线性结构
* */
public class Array {
    //方法可变参数,将参数转为数组形式

    public static int sum(int... data){
        int sum_01=0;
        for (int temp: data) {
            sum_01=sum_01+temp;
        }

        return sum_01;
    }


    public static void main(String[] args) {

       //  数组的定义
        int a[] ={0,1,20,3,4};
        int data[] =new int[3];    //仅仅 开辟栈内存，没有开辟堆内存，没有数值在里面，堆栈就是指的是  堆是值，栈是引用

        //便利
        for (int i = 0; i < a.length ; i++) {
//            System.out.println(a[i]);
        }
        for (int i2 : a){
//            System.out.println(i2);
        }

        //数组排序  -- 有多种办法，二分法，快排，冒泡，堆排



        //调用static 静态方法 sum
        System.out.print("Sum's Value "+Array.sum(2,54,98,66));









    }
}
