import java.util.Scanner;

public class pr6 {
    private double length;
    private double breadth;

    public RectangleAreaCalculator() {
        this.length = 0;
        this.breadth = 0;
    }

    public RectangleAreaCalculator(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        RectangleAreaCalculator rectangle1 = new RectangleAreaCalculator(length, breadth);
        double area1 = rectangle1.calculateArea();
        System.out.println("Area of rectangle with user input: " + area1);

        RectangleAreaCalculator rectangle2 = new RectangleAreaCalculator();
        double area2 = rectangle2.calculateArea();
        System.out.println("Area of rectangle with default values: " + area2);

        scanner.close();
    }
}
