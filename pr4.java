import java.util.Scanner;

// Define the Account class
class Account {
    int acc_no;
    double balance;

    // Method to take input from the user
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        acc_no = scanner.nextInt();
        System.out.println("Enter balance:");
        balance = scanner.nextDouble();
    }

    // Method to display account details
    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

// Define the Person class inheriting from Account
class Person extends Account {
    String name;
    long aadhar_no;

    // Method to take input from the user including additional details
    @Override
    void input() {
        super.input(); // Call input method of Account class to input account details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter Aadhar number:");
        aadhar_no = scanner.nextLong();
    }

    // Method to display person's details overriding the disp() method of Account
    // class
    @Override
    void disp() {
        super.disp(); // Call disp method of Account class to display account details
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

// Main class to demonstrate the program
public class pr4 {
    public static void main(String[] args) {
        Person[] persons = new Person[3]; // Create an array to hold three Person objects

        // Input details of three persons
        System.out.println("Enter details of three persons:");
        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            persons[i].input();
        }

        // Display details of three persons
        System.out.println("\nDetails of three persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            persons[i].disp();
            System.out.println();
        }
    }
}
