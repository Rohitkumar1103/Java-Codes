import java.util.Scanner;

class Shape {
    Shape() {}

    double calculateCost() {
        return 0.0;
    }
}

class TwoDimensional extends Shape {
    double length;
    double width;

    TwoDimensional(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateCost() {
        return length * width * 40;
    }
}

class ThreeDimensional extends TwoDimensional {
    double height;

    ThreeDimensional(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    double calculateCost() {
        return super.calculateCost() + length * width * height * 60;
    }
}

public class pr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for 2D shape (length and width):");
        double length2D = scanner.nextDouble();
        double width2D = scanner.nextDouble();

        System.out.println("Enter dimensions for 3D shape (length, width, and height):");
        double length3D = scanner.nextDouble();
        double width3D = scanner.nextDouble();
        double height3D = scanner.nextDouble();

        TwoDimensional shape2D = new TwoDimensional(length2D, width2D);
        ThreeDimensional shape3D = new ThreeDimensional(length3D, width3D, height3D);

        System.out.println("Cost of 2D shape: Rs " + shape2D.calculateCost());
        System.out.println("Cost of 3D shape: Rs " + shape3D.calculateCost());

        scanner.close();
    }
}
