package bro;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/15 20:24
 */
public class test {
    public static void main(String[] args) {
        //圆半径 假设   6
        Circle circle =new Circle(6);
        System.out.println("圆面积"+circle.area(+6));
        System.out.println("园周长"+circle.Perimeter(6));

        //矩形假设 长 6 宽  8

        Rectangle rectangle =new Rectangle(6,8);
        System.out.println("矩形面积"+rectangle.area(6,8));
        System.out.println("矩形周长"+rectangle.Perimeter(6,8));

        //三角形 三边 假设 3，4，5 高 6

        Triangle triangle =new Triangle(3,6,4,5);
        System.out.println("三角形周长"+triangle.Perimeter(3,4,5));
        System.out.println("三角形面积"+triangle.area(3,6));
        System.out.println("判断三角形是否相等"+ triangle.equal(3,5,4));

    }
}
