import java.util.*;

public class pr1{
  public static void main(String[] args){
    int n=3, m=3;
    int matrix [][] = new int[n][m];
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        System.out.print(matrix[i][j] +" ");
      }
      System.out.println();
    }
  }
}