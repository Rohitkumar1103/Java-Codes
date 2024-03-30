// Define the Apple class
class Apple {
    // Method specific to Apple class
    void show() {
        System.out.println("This is from Apple class.");
    }
}

// Define the Banana class which inherits from Apple
class Banana extends Apple {
    // Method specific to Banana class
    void show() {
        System.out.println("This is from Banana class.");
    }
}

// Define the Cherry class which inherits from Apple
class Cherry extends Apple {
    // Method specific to Cherry class
    void show() {
        System.out.println("This is from Cherry class.");
    }
}

// Main class to demonstrate dynamic method dispatch
public class pr3 {
    public static void main(String[] args) {
        // Creating objects of each class
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        // Using dynamic method dispatch to call show() method
        // It will call the overridden method based on the object type
        apple.show();
        banana.show();
        cherry.show();
    }
}
