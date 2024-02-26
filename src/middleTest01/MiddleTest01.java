package middleTest01;

import java.util.Scanner;

public class MiddleTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char option;

        do {
            System.out.println("도형을 선택하세요: ");
            System.out.println("1. 원");
            System.out.println("2. 사각형");
            System.out.println("3. 삼각형");

            int shapeOption = scan.nextInt();

            switch (shapeOption) {
                case 1:
                    System.out.println("원의 반지름을 입력하세요: ");
                    double radius = scan.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("원의 넓이: " + circle.getArea());
                    break;

                case 2:
                    System.out.println("사각형의 가로를 입력하세요: ");
                    double width = scan.nextDouble();
                    System.out.println("사각형의 세로를 입력하세요: ");
                    double height = scan.nextDouble();
                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.println("사각형의 넓이: " + rectangle.getArea());
                    break;

                case 3:
                    System.out.println("삼각형의 밑변을 입력하세요: ");
                    double triWidth = scan.nextDouble();
                    System.out.println("삼각형의 높이를 입력하세요: ");
                    double triHeight = scan.nextDouble();
                    Triangle triangle = new Triangle(triWidth, triHeight);
                    System.out.println("삼각형의 넓이: " + triangle.getArea());
                    break;

                default:
                    System.out.println("잘못된 선택입니다.");
            }
            System.out.println("계속하시겠습니까? (Y/N)");
            option = scan.next().charAt(0);
        } while (option == 'Y' || option == 'y');
    }
}
