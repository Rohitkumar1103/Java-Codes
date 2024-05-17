import java.util.*;

public class bubble{
  public static void bubbleSort(int arr[]){
    for(int i=0; i<arr.length; i++){
      int flag=0;
      for(int j=0; j<arr.length -1 -i; j++){
        if(arr[j] > arr[j+1]){
          //swap
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
          flag = 1;
        }
      }
      if(flag == 0){
        break;
      }
    }
  }
  public static void printArray(int arr[]){
    System.out.print("[");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] +" ");
    }
    System.out.println("]");
  }
  public static void main(String[] args){
    int arr[] = {5, 4, 1, 3, 2};
    bubbleSort(arr);
    printArray(arr);
  }
}