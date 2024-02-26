package middleTest01;

public class Triangle implements Shape{
    double triWidth;
    double triHeight;
    Triangle(double triWidth, double triHeight) {
        this.triWidth = triWidth;
        this.triHeight = triHeight;
    }

    @Override
    public double getArea() {
        return (triWidth * triHeight) / 2 ;
    }
}
