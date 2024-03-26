import java.util.Scanner;

public class pr5 {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double squareArea(double sideLength) {
        return sideLength * sideLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = scanner.nextInt();

        double radius, base, height, sideLength;

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + circleArea(radius));
                break;
            case 2:
                System.out.println("Enter the base of the triangle:");
                base = scanner.nextDouble();
                System.out.println("Enter the height of the triangle:");
                height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + triangleArea(base, height));
                break;
            case 3:
                System.out.println("Enter the side length of the square:");
                sideLength = scanner.nextDouble();
                System.out.println("Area of the square: " + squareArea(sideLength));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
