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
    public static void main(String[] args) {
       //  数组的定义
        int a[] ={0,1,2,3,4};
        int data[] =new int[3];    //仅仅 开辟新内存，没有数值在里面

        //便利
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
        for (int i2 : a){
            System.out.println(i2);
        }

    }
}
