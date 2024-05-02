import java.util.*;

public class Test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks: ");
    int marks = sc.nextInt();
    String report = marks >=33 ? "Pass" : "Fail";
    System.out.println(report);
  }
}