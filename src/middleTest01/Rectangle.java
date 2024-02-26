package middleTest01;

public class Rectangle implements Shape{
    double garo;
    double sero;
    Rectangle(double garo, double sero) {
        this.garo = garo;
        this.sero = sero;
    }

    @Override
    public double getArea() {
        return garo * sero;
    }
}
