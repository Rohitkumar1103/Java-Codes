import java.util.*;

public class largestNumber{
  public static int get_largest(int num[]){
    int largest = Integer.MIN_VALUE; // min_value = - infinity and Max_value= +infinity
    int smallest = Integer.MAX_VALUE;

    for(int i=0; i<num.length; i++){
      if(num[i] > largest){
        largest = num[i];
      }
      if(num[i] < smallest){
        smallest = num[i];
      }
    }
    System.out.println("Smallest number is: "+smallest);
    return largest;
  }
  public static void main(String[] args){
    int numbers[] = {12, 44, 26, 18, 32, 42, 84, 11};
    System.out.println("Largest value is: " +get_largest(numbers));
 }
}