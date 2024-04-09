import java.util.Scanner;

abstract class Student {
    protected int rollNo;
    protected int regNo;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter Reg No: ");
        regNo = scanner.nextInt();
    }

    public abstract void course();
}

class Kiitian extends Student {
    public void course() {
        System.out.println("Course: B.Tech in Computer Science");
    }
}

public class pr1 {
    public static void main(String[] args) {
        Kiitian student = new Kiitian();
        student.getInput();
        student.course(); 
        System.out.println("Roll No: " + student.rollNo);
        System.out.println("Reg No: " + student.regNo);
    }
}