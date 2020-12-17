package bro;

/**
 * God_Learning
 *
 * @author
 * @date 2020/12/15 20:14
 */
public class Triangle implements Shape{

    public Triangle(){}

    public Triangle(double botton,double high,double a1,double b1){}

    public Double area() {
        return null;
    }

    public Double Perimeter() {
        return null;
    }
    public Double area(double botton,double high) {
        return (botton*high)*0.5;
    }

    public Double Perimeter(double botton,double a1,double b1) {
        return botton +a1+b1 ;
    }
    public String equal(double botton,double a1,double b1) {
        if (botton == (a1 = b1)) {
         return "相等啊，等边三角形";
        }else {
            return "不行，不是等边三角形";
        }
    }
}
