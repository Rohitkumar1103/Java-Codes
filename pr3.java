import java.util.*;

public class pr3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the last number: ");
    int range = sc.nextInt();
    int count = 1;
    while (count <= range){
      System.out.print(count+ " ");
      count++;
    }
  }
}