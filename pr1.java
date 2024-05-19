import java.util.*;

public class pr1{
  public static void printLetters(String str){
    for(int i=0; i< str.length(); i++){
      System.out.print(str.charAt(i)+ " ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    String firstName = "Rohit";
    String lastName = "Kumar";
    String fullName = firstName +" "+ lastName;
    // System.out.println(fullName.charAt(4));
    printLetters(fullName);
  }
}