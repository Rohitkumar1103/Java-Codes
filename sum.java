import java.util.*;

public class sum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the last number: ");
    int n = sc.nextInt();
    int sum = 0;
    int i = 1;
    while (i <= n){
      sum = sum+i;
      i++;
    }
    System.out.print("Sum of Natural Number upto"+ n +" : " +sum);
}}