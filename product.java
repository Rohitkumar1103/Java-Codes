import java.util.*;

public class product{
  public static int calcProduct(int num1, int num2){
    int mul = num1*num2;
    return mul;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int product = calcProduct(a,b);
    System.out.println("Product of " + a + " & "+ b +" : " + product);
  }
}