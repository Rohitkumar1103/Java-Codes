class CounterThread extends Thread {
    private int lowerRange;
    private int upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        super(name);
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + getName());
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print(+i + " ");
            try {
                Thread.sleep(5); // Sleep for 5 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class pr1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java pr1 <ThreadName> <LowerRange> <UpperRange>");
            return;
        }

        String threadName = args[0];
        int lowerRange = Integer.parseInt(args[1]);
        int upperRange = Integer.parseInt(args[2]);

        Thread counterThread = new CounterThread(threadName, lowerRange, upperRange);
        counterThread.start();
    }
}