import java.util.*;

public class character{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = 'A';
    int n=5;
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
}}