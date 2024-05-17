import java.util.*;

public class duplicate{
  public static boolean constraintDuplicate(int num[]){
    for(int i=0; i<num.length -1; i++){
      for(int j=i+1; j<num.length; j++){
        if(num[i] == num[j]){
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String[] args){
    int arr[] = {1, 4, 7, 3, 4, 5};
    System.out.println(constraintDuplicate(arr));
  }
}