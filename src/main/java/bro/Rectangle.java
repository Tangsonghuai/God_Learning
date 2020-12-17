package bro;

/**
 * God_Learning
 *
 * @author
 * @date 2020/12/15 20:14
 */
public class Rectangle implements Shape{

    public  Rectangle(){}

    public  Rectangle(double length,double wide){}

    public Double area() {
        return null;
    }

    public Double Perimeter() {
        return null;
    }
    public Double area(double length,double wide) {
        return length * wide;
    }

    public Double Perimeter(double length,double wide) {
        return 2*(length+wide);
    }

}
