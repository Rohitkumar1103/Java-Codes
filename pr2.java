import java.util.Scanner;

class Plate {
    double length;
    double width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate created with dimensions: " + length + " x " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box created with dimensions: " + length + " x " + width + " x " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox created with dimensions: " + length + " x " + width + " x " + height + " and thickness: " + thickness);
    }
}

public class pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for Plate (length and width):");
        double lengthPlate = scanner.nextDouble();
        double widthPlate = scanner.nextDouble();

        System.out.println("Enter dimensions for Box (length, width, and height):");
        double lengthBox = scanner.nextDouble();
        double widthBox = scanner.nextDouble();
        double heightBox = scanner.nextDouble();

        System.out.println("Enter dimensions for WoodBox (length, width, height, and thickness):");
        double lengthWoodBox = scanner.nextDouble();
        double widthWoodBox = scanner.nextDouble();
        double heightWoodBox = scanner.nextDouble();
        double thicknessWoodBox = scanner.nextDouble();

        WoodBox woodBox = new WoodBox(lengthWoodBox, widthWoodBox, heightWoodBox, thicknessWoodBox);

        scanner.close();
    }
}
