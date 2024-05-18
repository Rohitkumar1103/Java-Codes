import java.util.*;

public class search{
  public static boolean searchKey(int matrix[][], int key){
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        if(matrix[i][j] == key){
          System.out.println("Found at cell (" +i+ "," +j+")");
          return true;
        }
      }
    }
    System.out.println("Key not found");
    return false;
  }
  public static void main(String[] args){
    int n=3, m=3;
    int matrix [][] = new int[n][m];
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    searchKey(matrix, 5);
  }
}