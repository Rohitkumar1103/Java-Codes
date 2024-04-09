import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;
    private Scanner scanner;

    public Head() {
        this.scanner = new Scanner(System.in);
    }

    public void getDetails() {
        System.out.print("Enter employee id: ");
        empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        empName = scanner.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter department id: ");
        deptId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter department name: ");
        deptName = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }

    // Close the Scanner when it's no longer needed
    public void closeScanner() {
        scanner.close();
    }
}

public class pr4 {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.displayDetails();
        head.closeScanner();
    }
}