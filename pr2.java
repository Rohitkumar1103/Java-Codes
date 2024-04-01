interface Motor {
    int capacity = 40;

    void run();

    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming electricity.");
    }
}

public class pr2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        System.out.println("Capacity of the washing machine: " + Motor.capacity);

        wm.run();
        wm.consume();
    }
}