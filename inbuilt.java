import java.util.*;
import java.util.Arrays;

public class inbuilt{
  public static void printArray(int arr[]){
    System.out.print("[");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] +" ");
    }
    System.out.println("]");
  }
  public static void main(String[] args){
    int arr[] = {5, 4, 1, 3, 2};
    // Arrays.sort(arr);
    // printArray(arr);
    Arrays.sort(arr, 0, 3);
    printArray(arr);
  }
}