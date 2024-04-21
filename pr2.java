class SharedPrinter {
    synchronized void print(String message) {
        for (int i = 0; i < 1; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrinterThread extends Thread {
    private SharedPrinter sharedPrinter;
    private String[] messages;

    public PrinterThread(SharedPrinter sharedPrinter, String[] messages) {
        this.sharedPrinter = sharedPrinter;
        this.messages = messages;
    }

    @Override
    public void run() {
        for (String message : messages) {
            sharedPrinter.print(message);
        }
    }
}

public class pr2 {
    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();

        String[] messages1 = { "I", "Love", "Java", "very","Much " };
        String[] messages2 = { "I ", "Love", "Java", "Very", "Much " };

        PrinterThread thread1 = new PrinterThread(sharedPrinter, messages1);
        PrinterThread thread2 = new PrinterThread(sharedPrinter, messages2);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}