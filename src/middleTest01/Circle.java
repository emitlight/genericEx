package middleTest01;

public class Circle implements Shape {
    double radius; //필드
    Circle(double radius) { //생성자
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
